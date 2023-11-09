import java.util.Scanner;

public class App7t4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Dame la nota de tus 3 exámenes y te diré la nota media de los mismos.");
        System.out.println("Escribe la primera");
        int nota1 = s.nextInt();
        System.out.println("Escribe la segunda");
        int nota2 = s.nextInt();
        System.out.println("Escribe la tercera");
        int nota3 = s.nextInt();
        if (nota1 < 4 || nota2 < 4 || nota3 < 4) {
            System.out.println("No se puede hacer media puesto que una de tus notas no da con el mínimo.");
        } else {
            System.out.printf("Tu nota media será de %.1f \n" + (nota1 + nota2 + nota3)/3);
        }
        s.close();
    }
}
