import java.util.Scanner;

public class App11t5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int numero = s.nextInt();
        for (int i = numero; i < numero + 5; i++) {
            System.out.printf("%4d %6d %8d\n", i, i*i, i*i*i);
        }
        s.close();
    }
}
