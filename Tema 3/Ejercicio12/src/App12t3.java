import java.text.DecimalFormat;
import java.util.Scanner;
public class App12t3 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe la nota que quieres sacar en el trimestre y la nota del primer examen separadas por un espacio.");
        double notaf = s.nextDouble();
        double nota1= s.nextDouble();
        double nota2 = (-nota1*40/100+notaf)*160/100;
        DecimalFormat df= new DecimalFormat("#.00");
        System.out.printf("La nota que deberías sacar en el siguiente examen será " + df.format(nota2));
        s.close();
        
    }
}
