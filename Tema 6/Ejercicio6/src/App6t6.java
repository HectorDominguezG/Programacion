import java.util.Scanner;

public class App6t6 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Adivina el número que estoy pensando entre el 0 y el 100");
        for (int i = 0; i < 1; i++) {
            int numeroaadivinar = (int)(Math.random() * 101);
            int intentos = 5;
            do {
                int numerointento = s.nextInt();
                intentos --;
                if (numerointento == numeroaadivinar) {
                    System.out.println("Enhorabuena, has acertado!");
                    break;
                } else {
                    if (intentos == 0) {
                        System.out.println("Lo siento, te quedaste sin intentos.");
                    } else {
                        if (numerointento < numeroaadivinar) {
                            System.out.println("Ese no es. Te quedan " + intentos + " intentos, prueba con un número mayor");
                        } else {
                            System.out.println("Ese no es. Te quedan " + intentos + " intentos, prueba con un número menor");
                        }
                    }
                }
            } while (intentos > 0);
            s.close();
        }
    }
}
