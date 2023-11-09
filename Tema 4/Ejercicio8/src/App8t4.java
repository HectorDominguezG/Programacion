import java.util.Scanner;

public class App8t4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Dame la nota de tus 3 exámenes y te diré la nota media de los mismos.");
        System.out.println("Escribe la primera");
        int nota1 = s.nextInt();
        System.out.println("Escribe la segunda");
        int nota2 = s.nextInt();
        System.out.println("Escribe la tercera");
        int nota3 = s.nextInt();
        double media = (nota1+nota2+nota3)/3;
        if (nota1 < 4 || nota2 < 4 || nota3 < 4) {
            System.out.println("No se puede hacer media puesto que una de tus notas no da con el mínimo.");
        }
        if (media < 5) {
            System.out.printf("Tu nota media será de %.1f \n" + media + "Insuficiente");
        } else {
            if (media >=5 && media <6) {
                System.out.printf("Tu nota media será de %.1f \n" + media + "Suficiente");
            } else {
                if (media == 6) {
                    System.out.printf("Tu nota media será de %.1f \n" + media + "Bien");
                } else {
                    if (media >=7 && media < 9) {
                        System.out.printf("Tu nota media será de %.1f \n" + media + "Notable");
                    } else {
                        if (media >= 9 || media <= 10 ) {
                            System.out.printf("Tu nota media será de %.1f \n" + media + "Sobresaliente");
                        }
                    }
                }
            }
        }
        s.close();
    }
}
