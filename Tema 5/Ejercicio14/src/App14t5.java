import java.util.Scanner;

public class App14t5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe primero el número y luego el exponente para calcular la potencia.");
        int numero = s.nextInt();
        int potencia = s.nextInt();
        int resultado = numero;
        int veces = potencia - 2;
        do {
            resultado *= numero;
            if (potencia == 1) {
                resultado = numero;
            }
            if (potencia == 0) {
                resultado = 1;
            }
            veces --;
        } while (veces >=0 && numero >=0);
        System.out.println("El número " + numero + " elevado a " + potencia + " es igual a " + resultado);
        s.close();
    }
    
}
