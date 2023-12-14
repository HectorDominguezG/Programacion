import java.util.Scanner;

public class Examen {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        // Controlamos que el número escogido sea uno válido
        long numeroescogido;
        do {
            System.out.println("Introduzca un número: " );
            numeroescogido = s.nextInt();
            s.nextLine();
            if (numeroescogido < 0) {
                System.out.println("Por favor, elija un número adecuado.");
            }
        } while (numeroescogido < 0);

        // Controlamos que la opción sea una válida
        String opcionescogida;
            System.out.println("Simple o Color (escriba S o C): ");
            opcionescogida = s.nextLine();

        // Tipos de opciones de salida
        switch (opcionescogida) {
            case "s": // Caso simple
                long numero = numeroescogido;
                long numerodadolavuelta = 0;
                int longitud = 0;
                while (numero > 0) { // Se da la vuelta al número
                    numerodadolavuelta = (numerodadolavuelta*10) + (numero % 10);
                    numero /=10;
                    longitud ++;
                }
                long numerodadolavuelta2 = numerodadolavuelta;
                int digitos;
                int numeromayor = 0;
                for (int i = 0; i < longitud; i++) { // Se averigua cuál es el dígito mayor
                    digitos = (int)(numerodadolavuelta % 10);
                    if (digitos > numeromayor) {
                        numeromayor = digitos;
                    }
                    numerodadolavuelta/=10;
                }

                for (int r = 0; r < longitud; r++) { // Se pinta la tabla
                    digitos = (int)(numerodadolavuelta2 % 10);
                    numerodadolavuelta2/=10;
                    for (int j = 1; j <= numeromayor+1; j++) {
                        System.out.print(" ---");
                    }
                    System.out.println();
                    System.out.print("| " + digitos + " |");
                    for (int j = 2; j <= numeromayor+1; j++) {
                        System.out.print("   |");
                    }
                    System.out.println();
                    }
                    for (int i = 1; i <= numeromayor+1; i++) {
                        System.out.print(" ---");
                    }
                break;


            case "c": // Caso Colores
            
            break;
            default:
                break;
        }
        s.close();

    }
}
