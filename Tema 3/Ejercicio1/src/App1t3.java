import java.util.Scanner;

public class App1t3 {
    
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Escriba dos números separados por un espacio y te diré la multiplicación.");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int total = num1*num2;
        System.out.println("La multiplicación del número " + num1 + " y del número " + num2 + " = " + total  ); 
        s.close();
    }
}
