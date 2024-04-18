package pacticoexcepcionesjava.ejercicio2.Ejercicio2;

public abstract class Vehiculo {

    private int velocidad;

    public void acelera(int velocidad) throws MiExcepcion {

        if (velocidad > 120) {
            throw new MiExcepcion(this);
        }
    }

    public void frena() {
        System.out.println("El auto está frenado");
        this.velocidad = 0;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}