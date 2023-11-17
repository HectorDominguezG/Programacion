import java.util.Scanner;

public class App10t5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        double numeros = 0;
        double numerointroducido = 0;
        double suma = 0;
        System.out.println("Dime los números que quieras que haga una media");
        while (numerointroducido >= 0) {
            numerointroducido = s.nextInt();
            numeros ++;
            suma +=numerointroducido;
        }
        System.out.println("La media de los números introducidos es " + (suma - numerointroducido)/(numeros-1));
        s.close();
    }
}
