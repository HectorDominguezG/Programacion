import java.util.Scanner;

public class App13t5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe 10 números y te diré cuantos son positivos y cuantos negativos.");
        int cantidaddenumeros = 10;
        int positivos = 0;
        int negativos = 0;
        do {
            int numeros = s.nextInt();
            cantidaddenumeros --;
            if (numeros>0) {
                positivos = positivos + 1;
            } else {
                negativos = negativos + 1;
            }
        } while (cantidaddenumeros>0);
        System.out.println("En esta lista hay " + positivos + " positivos y " + negativos + " negativos.");
        s.close();
    }
}
