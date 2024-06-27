import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        int agregar = 1;
        int modificar = 2;
        int eliminar = 3;
        int mostrar = 4;
        int buscar = 5;

        boolean valorlogico = true;
        System.out.println("1.agregar nuevo producto,2. actualizar precio de un producto,3.eliminar un producto, 4.mostrar todos los productos,5.buscar cualquier producto");

        while (valorlogico) {
            agregar = captura.nextInt();

            if (agregar == 1) {

                System.out.println("1.arroz");
                System.out.println("2.aceite");
                System.out.println("3.azucar");
                System.out.println("4.sal");
                System.out.println("5.huevos");
                System.out.println("agregar el numero del producto");
                int precio = captura.nextInt();


                if (precio == 1) {
                    System.out.println("has escogido arroz");


                } else if (precio == 2) {
                    System.out.println("has escogido aceite");

                } else if (precio == 3) {
                    System.out.println("has escogido azucar");


                } else if (precio == 4) {
                    System.out.println("has escogido sal");

                } else if (precio == 5) {
                    System.out.println("has escogido huevos");

                }


            }
            if (modificar == 2) {
                System.out.println("cual precio desea modificar");

                System.out.println("1.arroz 2500");
                System.out.println("2.aceite 7000");
                System.out.println("3.azucar 2700");
                System.out.println("4.sal 2300");
                System.out.println("5.huevos 9000");

                int valor = captura.nextInt();

                if (valor == 1) {
                    System.out.println("1.arroz");


                } else if (valor == 2) {
                    System.out.println("2.aceite");

                } else if (valor == 3) {
                    System.out.println("3.azucar");

                } else if (valor == 4) {
                    System.out.println("4.sal");

                } else if (valor == 5) {
                    System.out.println("5.huevos");

                }


            }
            if (eliminar == 3) {
                System.out.println("cual producto desea eliminar");

                System.out.println("1.arroz");
                System.out.println("2.aceite");
                System.out.println("3.azucar");
                System.out.println("4.sal");
                System.out.println("5.huevos");

                int valor = captura.nextInt();

                if (valor == 1) {
                    System.out.println("1.arroz");


                } else if (valor == 2) {
                    System.out.println("2.aceite");

                } else if (valor == 3) {
                    System.out.println("3.azucar");

                } else if (valor == 4) {
                    System.out.println("4.sal");

                } else if (valor == 5) {
                    System.out.println("5.huevos");

                }

            }
            if (mostrar == 4) {
                System.out.println("buscar productos por nombres");


                int valor = captura.nextInt();

                if (valor == 1) {

                    System.out.println("1.arroz");
                    System.out.println("2.aceite");
                    System.out.println("3.azucar");

                } else if (valor == 2) {

                    System.out.println("1.banano");
                    System.out.println("2.batata");
                    System.out.println("3.borojo");

                } else if (valor == 3) {

                    System.out.println("1.carne");
                    System.out.println("2.cafe");
                    System.out.println("3.calabaza");

                } else if (valor == 4) {
                    System.out.println("1.durazno");
                    System.out.println("2.damasco");
                    System.out.println("3.durian");

                } else if (valor == 5) {
                    System.out.println("1.espaguetis");
                    System.out.println("2.ensalada");
                    System.out.println("3.empanadas");


                }

            }
            if (buscar == 5) {
                System.out.println("buscar cualquier producto");


                int peso = captura.nextInt();

                if (peso == 1) {
                    System.out.println("1.arroz");


                } else if (peso == 2) {
                    System.out.println("2.aceite");

                } else if (peso == 3) {
                    System.out.println("3.azucar");

                } else if (peso == 4) {
                    System.out.println("4.sal");

                } else if (peso == 5) {
                    System.out.println("5.huevos");

                }
            }

        }

    }
}