import java.util.Scanner;
public class App7t3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Escribe el valor total del cuál quieres la factura completa");
        Scanner s = new Scanner(System.in);
        int valor = s.nextInt();
        int factura = valor * 21/100 + valor;
        System.out.println("Tu factura " + valor + " será igual a " + factura);
        s.close();


    }
}
