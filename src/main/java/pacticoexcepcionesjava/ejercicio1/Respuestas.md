# Parte A

## Ejercicio 1

### a. Cuál es el nombre en Java de la clase que define las excepciones ?

_La clase **Exceptions**_

### b. Cuál es el nombre en Java de la clase que representa las excepciones que se producen al invocar un método que pertenece a un objeto nulo ?

_La clase **NullPointerException**_

### c. Qué información aporta el método printStackTrace en el manejo de excepciones ?

_El método **printStackTrace()** en Java es útil en el manejo de excepciones ya que proporciona información detallada sobre dónde ocurrió la excepción en el código. Muestra la pila de llamadas en el momento en que se lanzó la excepción, incluyendo el número de línea de cada llamada en la pila. Esto puede ser muy útil para depurar y localizar exactamente dónde y por qué se produjo una excepción._

## Ejercicio 2

### Como obtiene el mensaje perteneciente a una excepción ?. De un ejemplo de código donde se utilice este dato. A qué clase pertenece este método ?

_El método **getMessage()** se utiliza para obtener el mensaje de detalle de una excepción. Este método pertenece a la clase **Throwable** (la superclase de todas las excepciones y errores en Java)._

```Java
try {
// Código que puede lanzar una excepción
Object obj = null;
obj.toString();
} catch (NullPointerException e) {
// Imprimir el mensaje de la excepción
System.out.println("Se ha producido una excepción: " + e.getMessage());
}

```

## Ejercicio 3

### Observe el siguiente fragmento de código

```Java
    String aux = “hola”;
	int aux2 = Integer.parseInt( aux );
```

### Qué sucede al ejecutar el mismo ?

### Modifíquelo para realizar manejo de excepciones.

_Se producirá una **NumberFormatException**.Porque se está intentando convertir la cadena "hola" a un número entero, lo cual no es posible._

```Java
String aux = "hola";
try {
    int aux2 = Integer.parseInt(aux);
} catch (NumberFormatException e) {
    System.out.println("Error al intentar convertir la cadena a un número: " + e.getMessage());
}
```

## Ejercicio 4

### Cree un programa en Java que produzca una IOException. Lance y maneje la excepción adecuadamente.

_Un ejemplo común de una situación que puede producir una IOException es cuando intentamos leer un archivo que no existe_

```Java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("archivo_no_existente.txt"));
            String line = reader.readLine();
        } catch (IOException e) {
            System.out.println("Se produjo una IOException: " + e.getMessage());
        }
    }
}
```

## Ejercicio 5

### Cree un método que capture al menos tres tipos de excepciones en forma anidada. (Cree también el método que las lanza).

_En el siguiente codigo hay que comentar/descomentar la excepcion que queramos usar_

```Java
public class Main {
    public static void main(String[] args) {
        try {
            lanzarExcepciones();
        } catch (IOException e) {
            System.out.println("Se produjo una IOException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Se produjo una NumberFormatException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Se produjo una NullPointerException: " + e.getMessage());
        }
    }

    public static void lanzarExcepciones() throws IOException, NumberFormatException, NullPointerException {
        // Lanzar IOException
        throw new IOException("Error de entrada/salida");

        // Lanzar NumberFormatException
        // throw new NumberFormatException("Error de formato de número");

        // Lanzar NullPointerException
        // throw new NullPointerException("Referencia nula");
    }
}
```

## Ejercicio 6

### Investigue en Internet y copie un árbol de excepciones de Java. Documente al menos cuatro de ellas.

```
java.lang.Throwable
│
├─ java.lang.Exception
│ ├─ java.lang.RuntimeException
│ │ ├─ java.lang.NullPointerException
│ │ ├─ java.lang.IllegalArgumentException
│ │ ├─ java.lang.IndexOutOfBoundsException
│ │ └─ ...
│ ├─ java.io.IOException
│ ├─ java.lang.ClassNotFoundException
│ └─ ...
│
└─ java.lang.Error
├─ java.lang.OutOfMemoryError
└─ ...
```

- _**java.lang.Throwable**: Es la clase raíz de la jerarquía de excepciones en Java. Todas las clases de error y excepción son subclases de esta clase._
- _**java.lang.Exception**: Es la clase que representa las excepciones que pueden ser atrapadas o declaradas. Es la superclase de todas las excepciones comprobadas_
- _**java.lang.RuntimeException**: Es la superclase de todas las excepciones no comprobadas. Las excepciones no comprobadas son excepciones que ocurren durante la ejecución del programa (en tiempo de ejecución)._
- _**java.io.IOException**: Es una excepción comprobada que se lanza cuando ocurre una operación de entrada/salida fallida o interrumpida._
- _**java.lang.NullPointerException**: Es una excepción no comprobada que se lanza cuando se intenta acceder a un objeto a través de una referencia nula._
- _**java.lang.Error**: Es la superclase de todas las clases de error. Los errores son condiciones excepcionales que son externas al sistema de aplicaciones y que un sistema de aplicaciones normalmente no intenta atrapar._
- _**java.lang.OutOfMemoryError**: Es un error que se lanza cuando la máquina virtual Java se queda sin memoria_

## Ejercicio 7

### Cree una jerarquía de excepciones de dos niveles. De ejemplos de usos de la misma.

_En Java, Se puede crear tu propia jerarquía de excepciones personalizadas extendiendo la clase **Exception** o cualquier otra clase de excepción existente._

```Java
// Nivel 1: Excepción personalizada genérica
public class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}

// Nivel 2: Excepciones más específicas
public class MiExcepcionEspecifica1 extends MiExcepcion {
    public MiExcepcionEspecifica1(String mensaje) {
        super(mensaje);
    }
}

public class MiExcepcionEspecifica2 extends MiExcepcion {
    public MiExcepcionEspecifica2(String mensaje) {
        super(mensaje);
    }
}
```

_En este ejemplo, **MiExcepcion** es una excepción personalizada genérica que se extiende desde la clase **Exception** de Java. Luego, **MiExcepcionEspecifica1** y **MiExcepcionEspecifica2** son excepciones más específicas que se extienden desde **MiExcepcion**. A continuación un ejemplo de como usarlas:_

```Java
public class Main {
    public static void main(String[] args) {
        try {
            metodoQueLanzaExcepcion();
        } catch (MiExcepcionEspecifica1 e) {
            System.out.println("Se produjo una MiExcepcionEspecifica1: " + e.getMessage());
        } catch (MiExcepcionEspecifica2 e) {
            System.out.println("Se produjo una MiExcepcionEspecifica2: " + e.getMessage());
        } catch (MiExcepcion e) {
            System.out.println("Se produjo una MiExcepcion: " + e.getMessage());
        }
    }

    public static void metodoQueLanzaExcepcion() throws MiExcepcion {
        // Lanzar una de las excepciones personalizadas
        throw new MiExcepcionEspecifica1("Este es un mensaje de error específico");
    }
}
```

## Ejercicio 8

### Qué muestra el siguiente programa ? (identifique la salida sin ejecutarlo)

```Java
public class Main {

     public static int devuelveNumero(int num) {
        try {
            if (num % 2 == 0) {
                throw new Exception("Lanzando excepcion");
            }
            return 1;
        } catch (Exception ex) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static void main(String[] args) {
         System.out.println(devuelveNumero(1));
    }

}
```

_Muestra "3" porque siempre se ejecuta el finally en java sin importar lo que suceda en el try/catch._
public class Main {
public static void main(String[] args) {
try {
metodo1();
} catch (Exception e) {
e.printStackTrace();
}
}
