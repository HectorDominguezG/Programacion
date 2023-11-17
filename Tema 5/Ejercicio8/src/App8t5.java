import java.util.Scanner;

public class App8t5 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Elige el número del que quieras la tabla de multiplicar");
        int eleccion = s.nextInt();
        int i = 0;
        do {
            System.out.println(eleccion + " x " + i + " = " + eleccion*i );
            i++;
        } while (i<11);
        s.close();
    }
}
