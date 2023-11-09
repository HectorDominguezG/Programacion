import java.util.Scanner;
public class App1t4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime un día de la semana con la primera en mayúscula para saber qué asignatura toca a primera hora.");
        String dia = s.nextLine();
        switch (dia) {
            case "Lunes":
                System.out.println("El lunes a primera toca Sistemas Informáticos");
                break;
            case "Martes":
                System.out.println("El Martes a primera toca Sistemas Informáticos");
                break;
            case "Miércoles":
                System.out.println("El Miércoles a primera toca Bases de Datos");
                break;
            case "Jueves":
                System.out.println("El Jueves a primera toca Lenguaje de Marcas");
                break;
            case "Viernes":
                System.out.println("El Viernes a primera toca Bases de Datos");
            default:
                System.out.println("Eso no es un día lectivo");
                break;
        }
        s.close();


    }
}

