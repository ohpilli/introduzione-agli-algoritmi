package m2.c1_java.es4;
import java.time.Year;

public class Cane extends Animale {

    protected Cane(String nome, Year annoDiNascita) {
        super(nome, annoDiNascita);
    }

    @Override
    public String verso() {
        return "Bau";
    }

    @Override
    public int numeroDiZampe() {
        return 4;
    }
}