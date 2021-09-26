package m2.c1_java.es1;

public class ContoCorrente implements BankAccount{
    protected double saldo;
    public ContoCorrente(double saldo) {
        this.saldo = saldo;
    }
    public ContoCorrente() {
        saldo = 0.0;
    }
    @Override
    public double deposit(double amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("ContoCorrente.deposit: amount < 0");
        } else {
            return saldo += amount;
        }
    }
    @Override
    public double withdraw(double amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("ContoCorrente.withdraw: amount < 0");
        } else {
            return saldo -= amount;
        }
    }
    @Override
    public String toString() {
        return "Saldo attuale: " + saldo;
    }
}
