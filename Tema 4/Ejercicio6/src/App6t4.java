import java.util.Scanner;
public class App6t4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Tenemos un objeto que cae de una altura h, vamos a calcular el tiempo que tarda en caer.");
        System.out.println("Selecciona la altura de la que quieras que caiga el objeto.");
        int h = s.nextInt();
        System.out.printf("El tiempo que tarda el objeto en caer es de %.2f \n", Math.sqrt(2*h/9.8));
        s.close();
    }
}
