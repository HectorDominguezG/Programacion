import java.util.Scanner;
public class Examen {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el tipo de producto:");
        System.out.println("1. Alimentación");
        System.out.println("2. Electrónica");
        System.out.println("3. Farmacia");
        System.out.println("4. Moda");
        int eleccion = s.nextInt();
        if (eleccion == 1) {
            System.out.println("Introduzca el tipo de alimento");
            System.out.println("1. Huevos");
            System.out.println("2. Leche");
            System.out.println("3. Pan");
            System.out.println("4. Fruta");
            System.out.println("5. Verdura");
            System.out.println("6. Otros");
            int eleccionalimentacion = s.nextInt();
            s.nextLine();
            if (eleccionalimentacion == 1) {
                System.out.println("Introduzca el nombre del producto");
                String producto = s.nextLine();
                System.out.println("Introduzca la cantidad de productos");
                int cantidad = s.nextInt();
                System.out.println("Introduzca el precio por unidad del producto");
                double precio = s.nextDouble();
                double totalsinIVA= precio*cantidad;
                double IVAalimentacion = totalsinIVA*0.04;
                System.out.println("Factura");
                System.out.println("__________________________________");
                System.out.println("Artículo     " + producto);
                System.out.println("Precio                " + precio + "\u20AC/unidad");
                System.out.println("Cantidad                      " + cantidad);
                System.out.println("Total             " + totalsinIVA + "\u20AC");
                System.out.println("IVA al 4%           " + IVAalimentacion +"\u20AC");
                System.out.println("__________________________________");
                System.out.println("Total con IVA                 " + totalsinIVA*1.04 + "\u20AC");
            } else {
                if (eleccionalimentacion == 2) {
                    System.out.println("Introduzca el nombre del producto");
                    String producto = s.nextLine();
                    System.out.println("Introduzca la cantidad de productos");
                    int cantidad = s.nextInt();
                    s.nextLine();
                    System.out.println("Introduzca el precio por unidad del producto");
                    double precio = s.nextDouble();
                    double totalsinIVA= precio*cantidad;
                    double IVAalimentacion = totalsinIVA*0.04;
                    System.out.println("Factura");
                    System.out.println("__________________________________");
                    System.out.println("Artículo     " + producto);
                    System.out.println("Precio     " + precio + "\u20AC/unidad");
                    System.out.println("Cantidad     " + cantidad);
                    System.out.println("Total     " + totalsinIVA + "\u20AC");
                    System.out.println("IVA al 4%     " + IVAalimentacion + "\u20AC");
                    System.out.println("__________________________________");
                    System.out.println("Total con IVA                 " + totalsinIVA*1.04 + "\u20AC");
                } else {
                    if (eleccionalimentacion == 3) {
                        System.out.println("Introduzca el nombre del producto");
                        String producto = s.nextLine();
                        System.out.println("Introduzca la cantidad de productos");
                        int cantidad = s.nextInt();
                        s.nextLine();
                        System.out.println("Introduzca el precio por unidad del producto");
                        double precio = s.nextDouble();
                        double totalsinIVA= precio*cantidad;
                        double IVAalimentacion = totalsinIVA*0.04;
                        System.out.println("Factura");
                        System.out.println("__________________________________");
                        System.out.println("Artículo     " + producto);
                        System.out.println("Precio     " + precio + "\u20AC/unidad");
                        System.out.println("Cantidad     " + cantidad);
                        System.out.println("Total     " + totalsinIVA + "\u20AC");
                        System.out.println("IVA al 4%     " + IVAalimentacion + "\u20AC");
                        System.out.println("__________________________________");
                        System.out.println("Total con IVA                 " + totalsinIVA*1.04 + "\u20AC");
                    }else {
                        if (eleccionalimentacion == 4) {
                            System.out.println("Introduzca el nombre del producto");
                            String producto = s.nextLine();
                            System.out.println("Introduzca la cantidad de productos");
                            int cantidad = s.nextInt();
                            s.nextLine();
                            System.out.println("Introduzca el precio por unidad del producto");
                            double precio = s.nextDouble();
                            double totalsinIVA= precio*cantidad;
                            double IVAalimentacion = totalsinIVA*0.04;
                            System.out.println("Factura");
                            System.out.println("__________________________________");
                            System.out.println("Artículo     " + producto);
                            System.out.println("Precio     " + precio + "\u20AC/unidad");
                            System.out.println("Cantidad     " + cantidad);
                            System.out.println("Total     " + totalsinIVA + "\u20AC");
                            System.out.println("IVA al 4%     " + IVAalimentacion+ "\u20AC");
                            System.out.println("__________________________________");
                            System.out.println("Total con IVA                 " + totalsinIVA*1.04+ "\u20AC");
                        } else {
                            if (eleccionalimentacion == 5) {
                                System.out.println("Introduzca el nombre del producto");
                                String producto = s.nextLine();
                                System.out.println("Introduzca la cantidad de productos");
                                int cantidad = s.nextInt();
                                s.nextLine();
                                System.out.println("Introduzca el precio por unidad del producto");
                                double precio = s.nextDouble();
                                double totalsinIVA= precio*cantidad;
                                double IVAalimentacion = totalsinIVA*0.04;
                                System.out.println("Factura");
                                System.out.println("__________________________________");
                                System.out.println("Artículo     " + producto);
                                System.out.println("Precio     " + precio + "\u20AC/unidad");
                                System.out.println("Cantidad     " + cantidad);
                                System.out.println("Total     " + totalsinIVA + "\u20AC");
                                System.out.println("IVA al 4%     " + IVAalimentacion + "\u20AC");
                                System.out.println("__________________________________");
                                System.out.println("Total con IVA                 " + totalsinIVA*1.04 + "\u20AC");
                            } else {
                                if (eleccionalimentacion == 6) {
                                    System.out.println("Introduzca el nombre del producto");
                                    String producto = s.nextLine();
                                    System.out.println("Introduzca la cantidad de productos");
                                    int cantidad = s.nextInt();
                                    s.nextLine();
                                    System.out.println("Introduzca el precio por unidad del producto");
                                    double precio = s.nextDouble();
                                    double totalsinIVA= precio*cantidad;
                                    double IVAalimentacion = totalsinIVA*0.1;
                                    System.out.println("Factura");
                                    System.out.println("__________________________________");
                                    System.out.println("Artículo     " + producto);
                                    System.out.println("Precio     " + precio + "\u20AC/unidad");
                                    System.out.println("Cantidad     " + cantidad);
                                    System.out.println("Total     " + totalsinIVA + "\u20AC");
                                    System.out.println("IVA al 10%     " + IVAalimentacion + "\u20AC");
                                    System.out.println("__________________________________");
                                    System.out.println("Total con IVA                 " + totalsinIVA*1.1 + "\u20AC");
                                    
                                } 
                                    
                                }
                            }
                        }
                    }
            }
            
        } else {
            if (eleccion == 2) {
                System.out.println("Introduzca el nombre del producto");
                String producto = s.nextLine();
                System.out.println("Introduzca la cantidad de productos");
                int cantidad = s.nextInt();
                s.nextLine();
                System.out.println("Introduzca el precio por unidad del producto");
                double precio = s.nextDouble();
                double totalsinIVA = precio*cantidad;
                double descuento = precio*0.20;
                double IVAelectronica = totalsinIVA*0.21;
                double totalreal = totalsinIVA - descuento + IVAelectronica;
                System.out.println("Factura");
                System.out.println("__________________________________");
                System.out.println("Artículo     " + producto);
                System.out.println("Precio     " + precio + "\u20AC/unidad");
                System.out.println("Cantidad     " + cantidad);
                System.out.println("Total     " + totalsinIVA + "\u20AC");
                System.out.println("Descuento (20%)   -" + descuento + "\u20AC");
                System.out.println("IVA al 21%     " + IVAelectronica + "\u20AC");
                System.out.println("__________________________________");
                System.out.println("Total con IVA                 " + totalreal+ "\u20AC");
                } else {
                    if (eleccion == 3) {
                        System.out.println("Introduzca el nombre del producto");
                        String producto = s.nextLine();
                        System.out.println("Introduzca la cantidad de productos");
                        int cantidad = s.nextInt();
                        s.nextLine();
                        System.out.println("Introduzca el precio por unidad del producto");
                        double precio = s.nextDouble();
                        double totalsinIVA= precio*cantidad;
                        double IVAfarmacia = totalsinIVA*0.04;
                        System.out.println("Factura");
                        System.out.println("__________________________________");
                        System.out.println("Artículo     " + producto);
                        System.out.println("Precio     " + precio + "\u20AC/unidad");
                        System.out.println("Cantidad     " + cantidad);
                        System.out.println("Total     " + totalsinIVA + "\u20AC");
                        System.out.println("IVA al 4%     " + IVAfarmacia + "\u20AC");
                        System.out.println("__________________________________");
                        System.out.println("Total con IVA                 " + totalsinIVA*1.04 + "\u20AC");
                    } else {
                        if (eleccion == 4) {
                            System.out.println("Introduzca el nombre del producto");
                            String producto = s.nextLine();
                            System.out.println("Introduzca la cantidad de productos");
                            int cantidad = s.nextInt();
                            s.nextLine();
                            System.out.println("Introduzca el precio por unidad del producto");
                            double precio = s.nextDouble();
                            double totalsinIVA= precio*cantidad;
                            double IVAmoda = totalsinIVA*0.21;
                            double totalcondescuento = (cantidad-cantidad/3)*precio;
                            double descuento = ((cantidad-cantidad/3)-cantidad)*precio;
                            double totalreal = totalsinIVA+descuento+IVAmoda;
                            System.out.println("Factura");
                            System.out.println("__________________________________");
                            System.out.println("Artículo     " + producto);
                            System.out.println("Precio     " + precio + "\u20AC/unidad");
                            System.out.println("Cantidad     " + cantidad);
                            System.out.println("Total              " + totalsinIVA + "\u20AC");
                            System.out.println("Descuento (3x2)         " + descuento + "\u20AC");
                            System.out.println("Total con descuento  " + totalcondescuento + "\u20AC");
                            System.out.println("IVA al 21%     " + IVAmoda + "\u20AC");
                            System.out.println("__________________________________");
                            System.out.println("Total con IVA                 " + totalreal + "\u20AC");
                    }
                }
            }
        }
        s.close();
    }
}
