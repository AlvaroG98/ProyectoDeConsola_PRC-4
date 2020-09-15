/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodeconsola_prc.pkg4;

import java.util.Scanner;

/**
 *
 * @author PabloLandos
 */
public class Menu {
    //Atributos
    private Scanner teclado;


    public void MenuAdmin() {
        int opcion = 0;
        teclado = new Scanner(System.in);
        do {
            System.out.println("Bienvenido" + " ");
            System.out.println("1. Venta Nueva");
            System.out.println("2. Consultar inventarios");
            System.out.println("3. Cambiar contraseña");
            System.out.println("4. Cerrar sesión");
            System.out.print("Digite la opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                //REALIZAR VENTA
                case 1: {
                    System.out.println("1- huevos c/u $0.10");
                    System.out.println("2- pollo c/u $5.00");
                    System.out.println("3- aceite c/u $3.00");
                    System.out.println("4- fósforos c/u $0.50");
                    System.out.println("5- dulces c/u $ 0.80");
                    System.out.println("6- margarina c/u $0.30");
                    System.out.println("7- jabón c/u $ 2.25");
                    System.out.println("8- carne c/u $ 2.75");
                    System.out.println("9- gaseosa c/u $1.80");
                    System.out.println("10- desechables c/u $3.25");
                    System.out.print("Ingrese el codigo de producto y cantidad: ");
                    System.out.println();
                }
                break;
                case 2:
                    //CONSULTAR INVENTARIOS
                    break;
                case 3:
                    //CAMBIAR CONTRASEÑA               
                    break;
                case 4:
                    //SALIR DEL SISTEMA
                    System.out.println("Saliendo del sistema....");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println();
        } while (opcion != 4);
    }

    public void MenuVendedor() {
        int opcion = 0;
        teclado = new Scanner(System.in);
        do {
            System.out.println("Bienvendio" + " ");
            System.out.println("1. Venta Nueva");
            System.out.println("2. Consultar inventarios");
            System.out.println("3. Cerrar sesión");
            System.out.print("Digite la opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                //REALIZAR VENTA
                case 1: {
                    System.out.println("1- huevos c/u $0.10");
                    System.out.println("2- pollo c/u $5.00");
                    System.out.println("3- aceite c/u $3.00");
                    System.out.println("4- fósforos c/u $0.50");
                    System.out.println("5- dulces c/u $ 0.80");
                    System.out.println("6- margarina c/u $0.30");
                    System.out.println("7- jabón c/u $ 2.25");
                    System.out.println("8- carne c/u $ 2.75");
                    System.out.println("9- gaseosa c/u $1.80");
                    System.out.println("10- desechables c/u $3.25");
                    System.out.print("Ingrese el codigo de producto y cantidad: ");
                }
                break;
                case 2:
                    //CONSULTAR INVENTARIOS
                    break;
                case 3:
                    //SALIR DEL SISTEMA                   
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println();
        } while (opcion != 3);
    }

    public void MenuInvitado() {
        int opcion = 0;
        teclado = new Scanner(System.in);
        do {
            System.out.println("Bienvendio" + " ");
            System.out.println("1. Consultar precios");
            System.out.println("2. Cerrar sesión");
            System.out.print("Digite la opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                //CONSULTAR PRECIOS
                case 1: {
                    System.out.println("Consultando precios...");
                }
                break;
                case 2:
                    //SALIR DEL SISTEMA                   
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println();
        } while (opcion != 2);
    }

}
