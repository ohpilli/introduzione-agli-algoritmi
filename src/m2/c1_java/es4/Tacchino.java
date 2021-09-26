package m2.c1_java.es4;
import java.time.Year;

public class Tacchino extends Animale {

    protected Tacchino(String nome, Year annoDiNascita) {
        super(nome, annoDiNascita);
    }

    @Override
    public String verso() {
        return "Glu glu";
    }

    @Override
    public int numeroDiZampe() {
        return 2;
    }
}