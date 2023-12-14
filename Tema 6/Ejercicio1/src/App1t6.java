public class App1t6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Tres tiradas de dados");
        for (int i = 0; i <= 3; i++) {
            System.out.println((int)(Math.random() * 6 + 1));
        }
    }
}
