package pacticoexcepcionesjava.ejercicio2.Ejercicio2;

public class MatriculaVencidaException extends Exception {

    private Matricula matricula;

    public MatriculaVencidaException() {
    }

    public MatriculaVencidaException(Matricula matricula) {
        this.matricula = matricula;
    }

    public void mensajePersonalizadoDeMatriculaVencida() {
        System.out.println(this.matricula.getChofer().getNombre() + " tiene la matricula vencida");
    }
}