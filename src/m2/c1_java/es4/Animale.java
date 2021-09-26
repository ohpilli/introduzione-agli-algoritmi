package m2.c1_java.es4;
import java.time.Year;

public abstract class Animale implements Comparable<Animale> {
    protected Animale(String nome, Year annoDiNascita) {
        this.nome = nome;
        this.annoDiNascita = annoDiNascita;
    }
    public int età() {
        return Year.now().getValue() - annoDiNascita.getValue();
    }
    @Override
    public int compareTo(Animale a) {
        return età() - a.età();
    }
    @Override
    public String toString() {
        return String.format("Nome: " + nome + "%nEtà: " + età() + "%nVerso: "
                            + verso() + "%nNumero di zampe: " + numeroDiZampe());
    }
    public abstract String verso();
    public abstract int numeroDiZampe();
    protected String nome;
    protected Year annoDiNascita;
}
