public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int digito = 1;
        int longitud = 4;
        int volteado = 8;
        int nuevoDigito = digito % 2 == 1 ? --digito : ++digito;
        for (int i = 0; i < longitud; i++) {
            digito = (int)(volteado/10);
        }
    }
}
