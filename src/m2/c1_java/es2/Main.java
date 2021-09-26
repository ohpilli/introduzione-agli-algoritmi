package m2.c1_java.es2;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona a = new Persona("A", LocalDate.of(1993, 1, 7));
        Persona b = new Persona(LocalDate.of(2021, 3, 7));
        Persona c = new Persona("Carlo", LocalDate.of(2021, 8, 4));

        a.setNome("Andrea");
        b.setNome("Berto");
        c.setDataDiNascita(LocalDate.of(2001, 8, 4));
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Impiegato e = new Impiegato("E", LocalDate.of(2021, 3, 7));
        Impiegato f = new Impiegato("Fabio", LocalDate.of(1921, 3, 7), 1500);

        e.setStipendio(1000);
        e.setNome("Elio");
        e.setDataDiNascita(LocalDate.of(2001, 3, 7));

        System.out.println(e);
        System.out.println(f);

        Stagista g = new Stagista("G", LocalDate.of(2064, 12, 24));
        Stagista h = new Stagista("H", LocalDate.of(2001, 3, 7), 1001);
        Stagista i = new Stagista("I",LocalDate.of(2021, 3, 7), 0);

        g.setNumeroPresenze(5);
        g.setNumeroIdentificativoStage(1000);
        g.setNome("Giorgio");
        g.setDataDiNascita(LocalDate.of(1964, 12, 24));
        g.setStipendio(500);
        h.setNumeroPresenze(10);
        i.setNumeroIdentificativoStage(1002);

        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

        Impiegato[] imp = {e, f, g};

        System.out.println(Impiegato.cercaGiovane(imp));
    }        
}