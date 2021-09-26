package m1.c1_introduzione;

/**
 * Riscaldamento (Introduzione)
 *
 * Università di Bologna Corso di laurea in Ingegneria dell'Automazione 84745 -
 * Introduzione agli algoritmi 23/02/2021
 *
 * @author Ilaria Volpe #766012
 */
public class Riscaldamento {
    public static int ricercaMancante(int[] a) {
        int n = a.length, s = n * (n + 1) / 2;
        for (int i = 1; i < n; i++) {
            s = s - a[i];
        }
        return s;
    }

    public static void main(String[] args) {
        int[] A = new int[args.length + 1];
        for (int i = 1; i < A.length; i++) {
            A[i] = Integer.parseInt(args[i - 1]);
        }
        System.out.println(ricercaMancante(A));
    }
}