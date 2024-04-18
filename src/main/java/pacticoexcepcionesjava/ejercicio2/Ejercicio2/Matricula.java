package pacticoexcepcionesjava.ejercicio2.Ejercicio2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Matricula {

    private int numero;
    private GregorianCalendar fechaVto;
    private Chofer chofer;

    public Matricula() {
    }

    public Matricula(int numero, GregorianCalendar fechaVto) {
        this.numero = numero;
        this.fechaVto = fechaVto;
    }

    public void fechaVencida() throws MatriculaVencidaException {

        GregorianCalendar aPartirDe = new GregorianCalendar(2024, Calendar.JANUARY, 1);

        if (!this.fechaVto.after(aPartirDe)) {
            throw new MatriculaVencidaException(this);
        }
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public int getNumero() {
        return numero;
    }

    public GregorianCalendar getFechaVto() {
        return fechaVto;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFechaVto(GregorianCalendar fechaVto) {
        this.fechaVto = fechaVto;
    }
}