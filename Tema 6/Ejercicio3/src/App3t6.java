public class App3t6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Carta de baraja española");
        int tipocarta = 0;
        for (int i = 1; i <= 1; i++) {
            tipocarta = (int)(Math.random() * 4 + 1);
            int numerocarta = (int)(Math.random() * 10 + 1);
            switch (tipocarta) {
                case 1: // Oros
                    for (int j = 1; j <= 1; j++) {
                        switch (numerocarta) {
                            case 2, 3, 4, 5, 6, 7:
                                System.out.println(numerocarta + " de Oros");
                                break;
                            case 1:
                                System.out.println("As de Oros");
                                break;
                            case 8:
                            System.out.println("Sota de Oros");
                            break;
                            case 9:
                            System.out.println("Caballo de Oros");
                            break;
                            case 10:
                            System.out.println("Rey de Oros");
                        }
                    }
                    break;
                case 2: // Copas
                    for (int j = 1; j <= 1; j++) {
                        switch (numerocarta) {
                            case 2, 3, 4, 5, 6, 7:
                                System.out.println(numerocarta + " de Copas");
                                break;
                            case 1:
                                System.out.println("As de Copas");
                                break;
                            case 8:
                            System.out.println("Sota de Copas");
                            break;
                            case 9:
                            System.out.println("Caballo de Copas");
                            break;
                            case 10:
                            System.out.println("Rey de Copas");
                        }
                    }
                    break;
                
                case 3: // Espadas
                    for (int j = 1; j <= 1; j++) {
                        switch (numerocarta) {
                            case 2, 3, 4, 5, 6, 7:
                                System.out.println(numerocarta + " de Espadas");
                                break;
                            case 1:
                                System.out.println("As de Espadas");
                                break;
                            case 8:
                            System.out.println("Sota de Espadas");
                            break;
                            case 9:
                            System.out.println("Caballo de Espadas");
                            break;
                            case 10:
                            System.out.println("Rey de Espadas");
                        }
                    }
                    break;
                case 4: // Bastos
                    for (int j = 1; j <= 1; j++) {
                        switch (numerocarta) {
                            case 2, 3, 4, 5, 6, 7:
                                System.out.println(numerocarta + " de Bastos");
                                break;
                            case 1:
                                System.out.println("As de Bastos");
                                break;
                            case 8:
                            System.out.println("Sota de Bastos");
                            break;
                            case 9:
                            System.out.println("Caballo de Bastos");
                            break;
                            case 10:
                            System.out.println("Rey de Bastos");
                        }
                    }
                    break;
            
            }
        }
    }
}
