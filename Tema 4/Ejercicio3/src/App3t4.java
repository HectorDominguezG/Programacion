import java.util.Scanner;

public class App3t4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Dime un número del 1 al 7 y te diré el día de la semana que corresponde.");
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Este día es Lunes");
                break;
            case 2:
                System.out.println("Este día es Martes");
                break;
            case 3:
                System.out.println("Este día es Miércoles");
                break;
            case 4:
                System.out.println("Este día es Jueves");
                break;
            case 5:
                System.out.println("Este día es Viernes");
                break;
            case 6:
                System.out.println("Este día es Sábado");
                break;
            case 7:
                System.out.println("Este día es Domingo");
                break;
            default:
            System.out.println("No hay más días a la semana");
                break;
        }
        s.close();
    }
}
