import java.util.Scanner;

public class App4t4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime las horas que has trabajado a la semana para decirte lo que cobras.");
        int horas = s.nextInt();
        if (horas <= 40 && horas >= 0) {
            System.out.println("El sueldo semanal correspondiente es " + horas*12);
        } else {
            if (horas >= 41) {
                System.out.println("El sueldo semanal correspondiente es " + horas*16);
            }
        }
    }
}
