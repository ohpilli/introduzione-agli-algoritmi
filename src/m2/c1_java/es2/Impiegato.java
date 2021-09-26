package m2.c1_java.es2;
import java.time.LocalDate;

public class Impiegato extends Persona {
    public Impiegato(String nome, LocalDate dataDiNascita) {
        super(nome, dataDiNascita);
        stipendio = 0;
    }
    public Impiegato(String nome, LocalDate dataDiNascita, int stipendio) {
        super(nome, dataDiNascita);
        this.stipendio = stipendio;
    }
    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }
    public int getStipendio() {
        return stipendio;
    }
    public static Impiegato cercaGiovane(Impiegato[] impiegati) {
        int i;
        if(impiegati.length == 0)
            return null;
        Impiegato giovane = impiegati[0];
        for(i=1; i < impiegati.length; i++) {
            if(giovane.compareTo(impiegati[i]) < 0)
                giovane = impiegati[i];
        }
        return giovane;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("%nStipendio: " + stipendio);
    }
    private int stipendio;   
}
