public class App10t6 {
    public static void main(String[] args) throws Exception {
        int caracter;
        int numerocaracteres;
        String relleno = "";
        for (int i = 0; i < 10; i++) {
            caracter = (int)(Math.random()*6+1);
            numerocaracteres = (int)(Math.random()*40)+1;
                switch (caracter) {
                    case 1:
                        relleno = "*";
                    break;
                    case 2:
                        relleno = "-";
                    break;
                    case 3:
                        relleno = "=";
                    break;
                    case 4:
                        relleno = ".";
                    break;
                    case 5:
                        relleno = "|";
                    break;
                    case 6:
                        relleno = "@";
                    break;
                }
            for (int j = 1; j <= numerocaracteres; j++) {
                System.out.print(relleno);
            }
            System.out.println();
        }
    }
}
