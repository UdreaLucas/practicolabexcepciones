package pacticoexcepcionesjava.ejercicio2.Ejercicio3;

import java.util.Random;

public class parImpar {

    public static void main(String[] args) {

        Random random = new Random();

        int valor = random.nextInt(101);

        try {
            if (valor % 2 != 0)
                throw new ImparException();
            System.out.println("El numero " + valor + " es par");
        } catch (ImparException e) {
            System.out.println("El numero " + valor + " es impar");
        }

    }

}
