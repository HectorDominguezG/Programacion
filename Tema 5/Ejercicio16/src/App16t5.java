import java.util.Scanner;

public class App16t5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe un número y te diré si es primo.");
        int numero = s.nextInt();
        boolean Primo = true;
        if (numero == 1 || numero == 2) {
            System.out.println("El número es primo.");
        }
        for (int i = 2; i < numero; i++) {
            if ((numero % i) == 0) {
                Primo = false;
                }
            }
            if (Primo) {
                System.out.println("El número es primo");
            } else {
                System.out.println("El número no es primo");
        }
        s.close();
    }
}
