package m2.c1_java.es1;

public class Main {
    public static void main(String[] args) {
        ContoCorrente c1 = new ContoCorrente();
        ContoCorrente c2 = new ContoCorrente();
        c1.deposit(50.0);
        c2.deposit(50.0);
        c1.withdraw(25.5);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        ContoCorrenteInternazionale ci1 = new ContoCorrenteInternazionale();
        ContoCorrenteInternazionale ci2 = new ContoCorrenteInternazionale(Currency.DOLLAR);
        ci1.deposit(100.0);
        ci2.deposit(100.0);
        ci1.withdraw(50.5);
        System.out.println(ci1.toString());
        System.out.println(ci2.toString());
    }
    
}
