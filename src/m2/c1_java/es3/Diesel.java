package m2.c1_java.es3;

public class Diesel extends Motore {
    public Diesel(int cilindrata, int numeroCilindri) {
        super(cilindrata, numeroCilindri);
    }
    protected double coefficiente() {
        return 0.2;
    }
}
