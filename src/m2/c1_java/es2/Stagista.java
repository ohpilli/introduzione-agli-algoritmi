package m2.c1_java.es2;
import java.time.LocalDate;

public class Stagista extends Impiegato {
    public Stagista(String nome, LocalDate dataDiNascita) {
        super(nome, dataDiNascita);
        numeroPresenze = 0;
        numeroIdentificativoStage = 0;
    }
    public Stagista(String nome, LocalDate dataDiNascita, int numeroIdentificativoStage) {
        super(nome, dataDiNascita);
        numeroPresenze = 0;
        this.numeroIdentificativoStage = numeroIdentificativoStage;
    }
    public Stagista(String nome, LocalDate dataDiNascita, int numeroPresenze, int numeroIdentificativoStage) {
        super(nome, dataDiNascita);
        this.numeroPresenze = numeroPresenze;
        this.numeroIdentificativoStage = numeroIdentificativoStage;
    }
    public void setNumeroPresenze(int numeroPresenze) {
        this.numeroPresenze = numeroPresenze;
    }
    public int getNumeroPresenze() {
        return numeroPresenze;
    }
    public void setNumeroIdentificativoStage(int numeroIdentificativoStage) {
        this.numeroIdentificativoStage = numeroIdentificativoStage;
    }
    public int getNumeroIdentificativoStage() {
        return numeroIdentificativoStage;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%nPresenze: " + numeroPresenze
        + "%nNumero identificativo stage: " + numeroIdentificativoStage);
    }

    private int numeroPresenze,
                numeroIdentificativoStage;
}
