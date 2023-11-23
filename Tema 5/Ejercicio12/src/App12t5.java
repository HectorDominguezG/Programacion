import java.util.Scanner;

public class App12t5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime cúantos números quieres de la sucesión de Fibonacci");
        int cantidad = s.nextInt();
        int numero1 = 0;
        int numero2 = 1;
        do {
            int numero3 = numero2+numero1;
            numero1=numero2;
            numero2=numero3;
            System.out.println(numero1);
            cantidad --;
        } while (cantidad>0);
        s.close();
    }
}
