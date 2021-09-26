package m2.c1_java.es2;
import java.time.LocalDate;

public class Persona implements Comparable<Persona> {
    @Override
    public int compareTo(Persona p) {
        return dataDiNascita.compareTo(p.dataDiNascita);
    }
    public Persona(LocalDate dataDiNascita) {
        nome = "Sconosciuto";
        this.dataDiNascita = dataDiNascita;
    }
    public Persona(String nome, LocalDate dataDiNascita) {
        this.nome = nome;
        this.dataDiNascita = dataDiNascita;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
    public String getNome() {
        return nome;
    }
    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }
    @Override
    public String toString() {
        return String.format("Nome: " + nome +
        "%nData di nascita: " + dataDiNascita);
    }
    private String nome;
    private LocalDate dataDiNascita;
}
