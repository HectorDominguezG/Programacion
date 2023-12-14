import java.util.Scanner;

public class App21t5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce números positivos y, cuando quieras parar, escribe uno negativo.");
        double numeros = 0;
        double numerointroducido = 0;
        double numeroimpar = 0;
        double numeropar = 0;
        double numeroimpar2 = 0;
        while (numerointroducido>=0) {
            numeros ++;
            numerointroducido = s.nextInt();
            if (numerointroducido/2 == 0) {
                if (numerointroducido<numeropar) {
                    numeropar = numerointroducido;
                }
                if (numerointroducido>numeropar) {
                    numeropar = numerointroducido;
                }
            } else {
                numeroimpar =+ numerointroducido;
                numeroimpar2 ++;
            }
        }
        System.out.println("Has introducido " + numeros + ". La media de los impares es de " + numeroimpar/numeroimpar2 + ". Y el mayor de los números pares es " + numeropar);
    }
}
