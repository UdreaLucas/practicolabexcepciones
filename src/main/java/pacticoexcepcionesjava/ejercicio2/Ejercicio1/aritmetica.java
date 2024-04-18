package pacticoexcepcionesjava.ejercicio2.Ejercicio1;

import javax.swing.JOptionPane;

public class aritmetica {
    public static void main(String[] args) {

        float a = ingresarA();
        float b = ingresarB();
        System.out.println("Resultado = " + calcular(a, b));

    }

    public static float ingresarA() {

        float a = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numerador: "));

        return a;

    }

    public static float ingresarB() {

        float b = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el donominador: "));

        return b;

    }

    public static float dividir(float a, float b) throws Exception {

        if (b == 0)
            throw new Exception();

        return a / b;

    }

    public static float calcular(float a, float b) {

        float resultado = 0;

        try {
            resultado = a - b + dividir(a, b);
        } catch (Exception e) {
            System.out.println("El denominador no puede ser 0");
            resultado = calcular(a, ingresarB());
        }

        return resultado;

    }

}