import java.util.Scanner;

public class App19t5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime la altura de la que quieres la pirámide");
        int altura = s.nextInt();
        s.nextLine();
        System.out.println("Ahora escribe el carácter con el que quieres que se pinte la pirámide.");
        String caracter = s.nextLine();
        int espacios = altura;
        int base = 1;
        int linea = 1;
        while (base<=altura) {
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= linea; i++) {
                System.out.print(caracter);
            }
            System.out.println();
            base ++;
            espacios --;
            linea +=2;
        }
        s.close();
    }
}

