import java.util.Scanner;

public class App2t3 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe cuantos euros quieres pasar a pesetas.");
        int euros = s.nextInt();
        double pesetas=euros*166.388;
        System.out.println("Tus euros quivalen a " + pesetas + " pesetas");
        s.close();

    }
}
