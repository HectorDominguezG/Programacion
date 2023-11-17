import java.util.Scanner;

public class App7t5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido a la interfaz de la caja fuerte. Si desea abrirla y obtener lo que hay en su interior, introduzca la combinación correcta.");
        int intentos = 4;
        do {
            System.out.println("Introduzca la combinación.");
            int combinacion = s.nextInt();
            if (combinacion == 4309) {
                System.out.println("La caja fuerte ha sido abierta satisfactoriamente.");
                break;
            } else {
                    System.out.println("La combinación es incorrecta");
                    intentos --;
            }
            if (intentos == 0) {
                System.out.println("Lo siento, te ha quedado sin intentos.");
            }
        } while (intentos > 0);
        s.close();
    }
}
