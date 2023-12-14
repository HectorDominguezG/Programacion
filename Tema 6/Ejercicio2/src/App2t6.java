public class App2t6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Una carta de la baraja francesa.");
        int tipocarta = 0;
        for (int i = 1; i <= 1; i++) {
            tipocarta = (int)(Math.random() * 4 + 1);
            int numerocarta = (int)(Math.random() * 13 + 1);
            switch (tipocarta) {
                case 1: // Picas
                    for (int j = 1; j <= 1; j++) {
                        switch (numerocarta) {
                            case 2, 3, 4, 5, 6, 7, 8, 9, 10:
                                System.out.println(numerocarta + " de Picas");
                                break;
                            case 1:
                                System.out.println("A de Picas");
                                break;
                            case 11:
                            System.out.println("J de Picas");
                            break;
                            case 12:
                            System.out.println("Q de Picas");
                            break;
                            case 13:
                            System.out.println("K de Picas");
                        }
                    }
                    break;
                case 2: // Corazones
                    for (int j = 1; j <= 1; j++) {
                        switch (numerocarta) {
                            case 2, 3, 4, 5, 6, 7, 8, 9, 10:
                                System.out.println(numerocarta + " de Corazones");
                                break;
                            case 1:
                                System.out.println("A de Corazones");
                                break;
                            case 11:
                            System.out.println("J de Corazones");
                            break;
                            case 12:
                            System.out.println("Q de Corazones");
                            break;
                            case 13:
                            System.out.println("K de Corazones");
                        }
                    }
                    break;
                
                case 3: // Diamantes
                    for (int j = 1; j <= 1; j++) {
                        switch (numerocarta) {
                            case 2, 3, 4, 5, 6, 7, 8, 9, 10:
                                System.out.println(numerocarta + " de Diamantes");
                                break;
                            case 1:
                                System.out.println("A de Diamantes");
                                break;
                            case 11:
                            System.out.println("J de Diamantes");
                            break;
                            case 12:
                            System.out.println("Q de Diamantes");
                            break;
                            case 13:
                            System.out.println("K de Diamantes");
                        }
                    }
                    break;
                case 4: // Tréboles
                    for (int j = 1; j <= 1; j++) {
                        switch (numerocarta) {
                            case 2, 3, 4, 5, 6, 7, 8, 9, 10:
                                System.out.println(numerocarta + " de Tréboles");
                                break;
                            case 1:
                                System.out.println("A de Tréboles");
                                break;
                            case 11:
                            System.out.println("J de Tréboles");
                            break;
                            case 12:
                            System.out.println("Q de Tréboles");
                            break;
                            case 13:
                            System.out.println("K de Tréboles");
                        }
                    }
                    break;
            
            }
        }
        
    }
}
