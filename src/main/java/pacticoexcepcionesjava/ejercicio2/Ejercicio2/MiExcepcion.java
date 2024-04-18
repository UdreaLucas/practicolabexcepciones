package pacticoexcepcionesjava.ejercicio2.Ejercicio2;

public class MiExcepcion extends Exception {

    public Vehiculo vehiculo;

    public MiExcepcion(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void superaLos120KmH() {
        System.out.println("El " + this.vehiculo.getClass().getSimpleName() + " superó los 120km/h");
    }
}
