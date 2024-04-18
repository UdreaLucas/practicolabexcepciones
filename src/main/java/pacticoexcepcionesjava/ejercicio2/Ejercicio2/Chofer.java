package pacticoexcepcionesjava.ejercicio2.Ejercicio2;

public class Chofer {

    private String nombre;
    private Matricula matricula;

    public Chofer(String nombe, Matricula matricula) {
        this.matricula = matricula;
        this.nombre = nombe;
    }

    public String getNombre() {
        return nombre;
    }

    public Matricula getMatricula() {
        throw new UnsupportedOperationException("Unimplemented method 'getMatricula'");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
}