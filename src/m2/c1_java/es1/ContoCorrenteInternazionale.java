package m2.c1_java.es1;

public class ContoCorrenteInternazionale extends ContoCorrente {
    private Currency valuta;
    public ContoCorrenteInternazionale(double saldo, Currency valuta) {
        super(saldo);
        this.valuta = valuta;
    }
    public ContoCorrenteInternazionale(double saldo) {
        super(saldo);
        valuta = Currency.EURO;
    }
    public ContoCorrenteInternazionale(Currency valuta) {
        super();
        this.valuta = valuta;
    }        
    public ContoCorrenteInternazionale() {
        super();
        valuta = Currency.EURO;
    }
    @Override
    public String toString() {
        return "Saldo: " + saldo + ". Valuta:" + valuta;
    }

}
