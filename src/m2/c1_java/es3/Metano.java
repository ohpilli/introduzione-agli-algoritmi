package m2.c1_java.es3;

public class Metano extends Motore {
    public Metano(int cilindrata, int numeroCilindri) {
        super(cilindrata, numeroCilindri);
    }
    protected double coefficiente() {
        return 0.2;
    }
}
