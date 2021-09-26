package m2.c1_java.es3;

public abstract class Motore {
    protected int cilindrata,
    numeroCilindri;

    protected Motore(int cilindrata, int numeroCilindri) {
        this.cilindrata = cilindrata;
        this.numeroCilindri = numeroCilindri;
    }
    protected abstract double coefficiente();
    public int potenza() {
        return (int)(cilindrata/numeroCilindri*coefficiente());
    }
}
