import java.util.Scanner;

public class App9t4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Vamos a realizar una ecuación de segundo grado la cual es: ax2 + bx + c = 0");
        System.out.println("Para ello dame los valores de a, b, c separados con un espacio.");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        double resultado1 = (-b + Math.sqrt(b-4*a*c))/2*a;
        double resultado2 = (-b - Math.sqrt(b-4*a*c))/2*a;
        if (a == 0) {
            System.out.println("No se puede hacer la ecuación con ese valor de a");
        } else {
            System.out.printf("Los resultados de la ecuación son %.2f \n" + resultado1 + "%.2f \n " + resultado2);
        }
        s.close();
        
    }
}
