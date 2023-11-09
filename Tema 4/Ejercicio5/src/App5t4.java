import java.util.Scanner;

public class App5t4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce primero el valor de a para calcular la siguiente ecuación: ax + b = 0");
        int a = s.nextInt();
        System.out.println("Ahora introduce el valor de b");
        int b = s.nextInt();
        if (a > 0 && b > 0 || a < 0 && b < 0 || a < 0 && b > 0 || a > 0 && b < 0) {
            System.out.println("El resultado de la ecuación es que x = " + (-b/a));
        } else {
            if (a == 0) {
                System.out.println("Con ese valor de a no existe solución");
            }
        }
        s.close();
    }
}
