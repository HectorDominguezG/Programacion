import java.util.Scanner;

public class App20t5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe la altura de la que quieres que sea la pirámide.");
        int altura = s.nextInt();
        s.nextLine();
        System.out.println("Ahora dime el caracter con el que quieres que se imprima la pirámide");
        String caracter = s.nextLine();
        int altura2 = 1;
        int espacios = altura - 1;
        int espacios2 = 0;
        while (altura2<altura) {
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            System.out.print(caracter);
            for (int i = 1; i < espacios2; i++) {
                System.out.print(" ");
            }
            if (altura2>1) {
                System.out.print(caracter);
            }
            System.out.println();
            altura2++;
            espacios --;
            espacios2 +=2;
        }
        for (int i = 1; i < altura2*2; i++) {
            System.out.print(caracter);
        }
        s.close();
    }
}