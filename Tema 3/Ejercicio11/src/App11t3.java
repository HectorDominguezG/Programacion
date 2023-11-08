import java.util.Scanner;

public class App11t3 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el valor en Kb: ");
        double numero_Kb = s.nextDouble();
        double numero_Mb = numero_Kb / 1024;
        System.out.println("El equivalente en Mb es: " + (numero_Mb) + "Mb");
        s.close(); 

    }
}
