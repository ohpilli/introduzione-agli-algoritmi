package m2.c1_java.es5;

import java.time.Year;

public class Cane implements Animale {

    protected Cane(String nome, Year annoDiNascita) {
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

    @Override
    public String verso() {
        return "Bau";
    }

    @Override
    public int numeroDiZampe() {
        return 4;
    }
    protected String nome;
    protected Year annoDiNascita;
}