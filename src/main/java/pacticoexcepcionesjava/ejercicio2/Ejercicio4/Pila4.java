package pacticoexcepcionesjava.ejercicio2.Ejercicio4;

public class Pila4 {
    public static void main(String[] args) {

        try {
            metodo1();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void metodo1() throws Exception {
        metodo2();
    }

    public static void metodo2() throws Exception {
        metodo3();
    }

    public static void metodo3() throws Exception {
        metodo4();
    }

    public static void metodo4() throws Exception {
        throw new Exception("Lanzado en metodo 4");
    }
}
