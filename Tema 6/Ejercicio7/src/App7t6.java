public class App7t6 {
    public static void main(String[] args) throws Exception {
        int respartido;
        int columnas = 3;
        for (int filas = 1; filas <= 15; filas++) {
            System.out.printf("%4d. |", filas);
            if (filas == 15) {
                columnas = 1;
            }
            for (int apuesta = 1; apuesta <= columnas; apuesta++) {
                respartido = (int)(Math.random()*3)+1;
                switch (respartido) {
                    case 1:
                        System.out.print("1  |");
                        break;
                    case 2:
                        System.out.print("  2|");
                    break;
                    case 3:
                        System.out.print(" X |");
                    break;
                }
            }
            System.out.println();
        }
    }
}
