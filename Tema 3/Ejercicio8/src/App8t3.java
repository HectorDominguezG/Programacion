import java.util.Scanner;
public class App8t3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Escribe cuantas horas trabajas a la semana y te diré tu salario semanal.");
        Scanner s = new Scanner(System.in);
        int horas = s.nextInt();
        int salario = horas*12;
        System.out.println("Tu salario semanal teniendo en cuenta que trabajas " + horas + " horas es de " + salario + " euros.");

    }
}
