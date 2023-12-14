public class App11t6 {
    public static void main(String[] args) throws Exception {
        int nota;
        int suspensos = 0;
        int suficientes = 0;
        int bien = 0;
        int notables = 0;
        int sobresalientes = 0;
        for (int i = 0; i < 20; i++) {
            nota = (int)(Math.random()*5+1);
            switch (nota) {
                case 1:
                    System.out.print("Suspenso ");
                    suspensos++;
                break;
                case 2:
                    System.out.print("Suficiente ");
                    suficientes++;
                break;
                case 3:
                    System.out.print("Bien ");
                    bien ++;
                break;
                case 4: 
                    System.out.print("Notable ");
                    notables ++;
                break;
                case 5:
                    System.out.print("Sobresaliente ");
                    sobresalientes ++;
                break;
                
            }
            System.out.println();
        }
        System.out.println("Han habido " + suspensos + " suspensos");
        System.out.println("Han habido " + suficientes + " suficientes");
        System.out.println("Han habido " + bien + " bienes");
        System.out.println("Han habido " + notables + " notables");
        System.out.println("Han habido " + sobresalientes + " sobresalientes");
    }
}
