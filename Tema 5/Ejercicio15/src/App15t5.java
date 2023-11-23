import java.util.Scanner;

public class App15t5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe un número y su exponente.");
        int numero = s.nextInt();
        int exponente = s.nextInt();
        int exponente2 = 1;
        int resultado = numero;
        do {
            System.out.println(numero + "^" + exponente2 + " = " + resultado);
            exponente2 ++;
            if (exponente2 == 1) {
                resultado = numero;
            }
            resultado *= numero;
        } while (exponente2 <= exponente);
        s.close();
    }
}
