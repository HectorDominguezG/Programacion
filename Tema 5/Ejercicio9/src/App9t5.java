import java.util.Scanner;

public class App9t5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int digitos = 1;
        System.out.println("Escribe un número y te diré cuantos digitos tiene");
        int numero = s.nextInt();
        while (numero>10) {
            numero/=10;
            digitos++;
        }
        System.out.println("El número " + numero + " tiene " + digitos + " dígitos.");
        s.close();
    }
}
