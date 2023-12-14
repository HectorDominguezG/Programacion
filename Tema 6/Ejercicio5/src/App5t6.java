public class App5t6 {
    public static void main(String[] args) throws Exception {
        System.out.println("50 numeros aleatorios entre 100 y 199. Maximo minimo y media");
        for (int j = 0; j < 1; j++) {
            int numeromenor = 200;
            int suma = 0;
            int numeromayor = 0;
            for (int i = 0; i < 50; i++) {
                int numeros = (int)(Math.random() * 99 + 100);
                System.out.println(numeros + " ");
                if (numeros>numeromayor) {
                    numeromayor=numeros;
                }
                if (numeros<numeromenor) {
                    numeromenor=numeros;
                }
                suma += numeros;
            }
            System.out.println("Numero mayor");
            System.out.println(numeromayor);
            System.out.println("Numero menor");
            System.out.println(numeromenor);
            System.out.println("Media");
            System.out.println(suma/50);
        }
    }
}
