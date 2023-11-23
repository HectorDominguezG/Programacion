import java.util.Scanner;
public class App17t5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe un número y lesumaré los siguientes 100 números.");
        int numero = s.nextInt();
        int suma = 0;
        for (int i = numero; i < numero+100; i++) {
            suma +=i;
        }
        System.out.println("La suma de los siguientes 100 numeros de " + numero + " es igual a " + suma);
        s.close();
    }
}
