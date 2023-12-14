import java.util.Scanner;

public class App18t5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int numero1;
        int numero2;
        do {
            System.out.println("Escribe dos números y te diré cúantos números enteros hay entre ellos de 7 en 7.");
            numero1 = s.nextInt();
            numero2 = s.nextInt();
            if (numero1==numero2) {
                System.out.println("Elige otros dos numeros.");
            }
        } while (numero1==numero2);
        if (numero1>numero2) {
            int ayuda = numero1;
            numero1=numero2;
            numero2=ayuda;
        }
        for (int i = numero1; i <= numero2; i+=7) {
            System.out.print(i + " ");
        }
        System.out.println();
        s.close();
    }
}
