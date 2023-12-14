public class App4t6 {
    public static void main(String[] args) throws Exception {
        System.out.println("20 números aleatorios entre 0 y 10");
        for (int i = 0; i < 20; i++) {
            int numeros = (int)(Math.random() * 11);
            System.out.print(numeros + "  ");
        }
    }
}
