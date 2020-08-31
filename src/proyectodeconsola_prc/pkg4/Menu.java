/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconsolaprc4;

import java.util.Scanner;

/**
 *
 * @author PabloLandos
 */
public class Menu {
    //Atributos
    private Scanner teclado;
    private Scanner teclado2;
 boolean salir = false;
        int opcion;
        double opcioncase;
        String inventario;
        
 public void inicializar() {
 teclado=new Scanner(System.in);
System.out.println("Bienvenido"/**+ Nombre**/);
             System.out.println("¿Que desea hacer?");
            
            System.out.println("1. Venta Nueva 1");
            System.out.println("2. Consultar inventarios 2");
            System.out.println("3. Cambiar contraseña 3");
            System.out.println("4. Salir del sistema");
            System.out.print("Escribe una opcion: ");
                opcion = teclado.nextInt();
 }

 public void imprimir() {
     teclado2=new Scanner(System.in);
  switch (opcion) {
                    case 1:
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
                        opcioncase = teclado2.nextDouble();
                        System.out.println("Gracias por realizar su compra!");
                        break;
                    case 2:
                        System.out.print("Ingrese el nombre del producto: ");
                        inventario = teclado2.nextLine();
                        /*System.out.println("Los inventarios son: ");
                        System.out.println("Huevos: 500 Unidades");
                        System.out.println("Pollo: 300 Unidades");
                        System.out.println("Aceite: 250 Unidades");
                        System.out.println("fósforos: 400 Unidades");
                        System.out.println("Dulces: 800 Unidades");
                        System.out.println("Margarina: 200 Unidades");
                        System.out.println("Jabon: 350 Unidades");
                        System.out.println("Carne: 100 Unidades");
                        System.out.println("Gaseosa: 450 Unidades");
                        System.out.println("Desechables: 1000 Unidades");*/
                        break;
                    case 3:
                        System.out.println("Cambiar contraseña");
                        System.out.println("1- admin / admin123");
                        System.out.println("2- vendedor / vendedor123");
                        System.out.println("3- invitado / invitado123");
                        System.out.println("Introduce los datos:");                        
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
 }


 public static void main(String[] ar) {
 Menu persona1;
 persona1=new Menu();
 persona1.inicializar();
 persona1.imprimir();
 }
}
