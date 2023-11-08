import java.util.Scanner;

public class App10t3 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el valor en Kb: ");
        double Megas = s.nextDouble();
        double Kb = Megas * 1024;
        System.out.println("El equivalente en Kb es: " + (Kb) + "Kb");
        s.close(); 

    }
}
