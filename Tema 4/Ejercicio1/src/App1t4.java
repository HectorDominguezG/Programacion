import java.util.Scanner;
import java.text.DecimalFormat;
public class App1t4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la altura de la bandera en cm");
        int altura = s.nextInt();
        System.out.println("Ahora introduce el ancho en cm");
        int ancho = s.nextInt();
        System.out.println("¿Quieres un bordado en la bandera? (Responde si o no)");
        String bordado = s.nextLine();
        int dimensionesbandera = altura*ancho;
        double preciobandera = dimensionesbandera/100;
        DecimalFormat df = new DecimalFormat("#.00");
        if (bordado == "si") {
            double preciototal = preciobandera + 2.50 + 3.25;
            System.out.println("Gracias, aquí tiene el desglose de su factura");
            System.out.println("Bandera de " + dimensionesbandera + "cm2: " + df.format(preciobandera) + "€");
            System.out.println("Con escudo: 2.50€");
            System.out.println("Gastos de envío: 3.25€");
            System.out.println("Precio total: " + preciototal);
        } else {
            
        }
        
        
        }
    }

