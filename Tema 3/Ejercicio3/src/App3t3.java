import java.util.Scanner;

public class App3t3 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe cuantas pesetas quieres pasar a euros.");
        int pesetas = s.nextInt();
        double euros=pesetas/166.388;
        System.out.println("Tus pesetas quivalen a " + euros + " euros");
        s.close();
    }
}
