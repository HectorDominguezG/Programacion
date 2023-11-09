import java.util.Scanner;

public class App2t4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor dime la hora, sin minutos, en la que estás realizando esta corrección.");
        int hora = s.nextInt();
        if (hora >= 6 && hora <=12) {
            System.out.println("¡Buenos días!");
        } else {    
            if (hora >= 13 && hora <= 20) {
                System.out.println("¡Buenas tardes!");
            } else { 
                if ((hora <= 5 || hora >=21) && hora < 24) {
                    System.out.println("¡Buenas noches!");
                }
            }
            
        }
        s.close();
    }
    
}

