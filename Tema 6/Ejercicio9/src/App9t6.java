public class App9t6 {
    public static void main(String[] args) throws Exception {
        int numeroaleatorio;
        int numerostotales = 0;
        do {
            numeroaleatorio = (int)(Math.random()*51)*2;
            if (numeroaleatorio> 0) {
                System.out.println(numeroaleatorio);
                numerostotales ++;
            }
            if (numeroaleatorio == 24) {
                System.out.println("Se han generado " + numerostotales + " numeros pares antes de que saliera el 24.");
            }
        } while (numeroaleatorio != 24);
        
    }
}
