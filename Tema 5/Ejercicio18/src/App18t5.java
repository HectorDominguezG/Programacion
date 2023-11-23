import java.util.Scanner;

public class App18t5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe dos números y te diré cúantos números enteros hay entre ellos de 7 en 7.");
        int numero1 = s.nextInt();
        int numero2 = s.nextInt();
        int numeros = 0;
        
        System.out.println("La cantidad de números enteros de 7 en 7 entre " + numero1 + " y " + numero2 + " es igual a " + numeros);
    }
}
