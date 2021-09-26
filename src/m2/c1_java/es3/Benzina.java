package m2.c1_java.es3;

public class Benzina extends Motore{
    public Benzina(int cilindrata, int numeroCilindri) {
        super(cilindrata, numeroCilindri);
    }
    protected double coefficiente() {
        return 0.1;
    }   
}
