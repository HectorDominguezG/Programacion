import java.util.Scanner;

public class App4t3 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Escriba dos números separados por un espacio y verá el resultado de su suma, resta, multiplicación y división.");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int ressum = num1+num2;
        int resres = num1-num2;
        int resmul = num1*num2;
        double resdiv = num1/num2;
        System.out.println("El resultado de la suma de " + num1 + " y de " + num2 + " = " + ressum);
        System.out.println("El resultado de la resta de " + num1 + " y de " + num2 + " = " + resres);
        System.out.println("El resultado de la multiplicación de " + num1 + " y de " + num2 + " = " + resmul);
        System.out.println("El resultado de la división de " + num1 + " y de " + num2 + " = " + resdiv);
        s.close();
    }
}
