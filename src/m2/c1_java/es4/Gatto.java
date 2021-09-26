package m2.c1_java.es4;
import java.time.Year;

public class Gatto extends Animale {

    protected Gatto(String nome, Year annoDiNascita) {
        super(nome, annoDiNascita);
    }

    @Override
    public String verso() {
        return "Miao";
    }

    @Override
    public int numeroDiZampe() {
        return 4;
    }    
}