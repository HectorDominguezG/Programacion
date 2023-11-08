import java.util.Scanner;

public class App9t3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Dime la altura y el radio del que quieres que sea el cono y te diré su volumen. Escríbelos separados con espacios.");
        Scanner s = new Scanner(System.in);
        int altura = s.nextInt();
        int radio = s.nextInt();
        double volumen = Math.PI*radio*radio*altura/3;
        System.out.println("El volumen del cono de dimensiones escogidas es de " + volumen + "metros cúbicos");
        s.close();
    }
}
