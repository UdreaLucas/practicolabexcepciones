package pacticoexcepcionesjava.ejercicio2.Ejercicio2;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        Auto auto = new Auto();
        Camion camion = new Camion();
        Chofer chofer1 = new Chofer("Pepe Hernandez", new Matricula(16532947, new GregorianCalendar(2024, 2, 15)));
        Chofer chofer2 = new Chofer("Carlos Gutierrez", new Matricula(16532947, new GregorianCalendar(2023, 5, 12)));

        try {
            // Metodo acelera
            auto.acelera(125);
            camion.acelera(110);

            chofer1.getMatricula().setChofer(chofer1);
            // Matricula vencida
            chofer1.getMatricula().fechaVencida();

            chofer2.getMatricula().setChofer(chofer2);
            // Matricula vencida
            chofer2.getMatricula().fechaVencida();
        } catch (MatriculaVencidaException e) {
            e.mensajePersonalizadoDeMatriculaVencida();
        } catch (MiExcepcion e) {
            e.superaLos120KmH();
        }
    }
}
