import java.util.Scanner;

public class App5t3 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Escriba la base y la altura del cuadrado separadas por un espacio y podrá saber el valor del área.");
        int base = s.nextInt();
        int altura = s.nextInt(); 
        int area = base*altura;
        System.out.println("El cuadrado de dimensiones escogidas tiene un área de valor " + area + "metros cuadrados");
        s.close();
    }
}
