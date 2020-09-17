package proyectodeconsola_prc.pkg4;

import java.util.Scanner;
import proyectodeconsola_prc.pkg4.login;
import proyectodeconsola_prc.pkg4.Menu;
import proyectodeconsola_prc.pkg4.Ventas;
import proyectodeconsola_prc.pkg4.bitacora;

public class main {

    public static void main(String[] args) {
        login l = new login();
        bitacora b = new bitacora();
        Menu m2 = new Menu();
        Ventas[] v = new Ventas[10];
        v[0] = new Ventas();
        int contVentas = 0;
        Catalogo[] catalogo = new Catalogo[20];
        catalogo[0] = new Catalogo(1, "pan", 1.30, 20);
        catalogo[1] = new Catalogo(2, "leche", 1.5, 15);
        catalogo[2] = new Catalogo(3, "margarina", 0.75, 25);
        catalogo[3] = new Catalogo(4, "huevos", 0.1, 30);
        catalogo[4] = new Catalogo(5, "papel higienico", 0.8, 30);
        catalogo[5] = new Catalogo(6, "jabón", 0.6, 10);
        catalogo[6] = new Catalogo(7, "shampoo", 4.25, 15);
        catalogo[7] = new Catalogo(8, "desodorante", 3.25, 15);
        catalogo[8] = new Catalogo(9, "frijoles naturas", 0.8, 25);
        catalogo[9] = new Catalogo(10, "aceite", 1.1, 15);
        catalogo[10] = new Catalogo(11, "queso chedar", 3.8, 20);
        catalogo[11] = new Catalogo(12, "crema vaquita", 0.6, 25);
        catalogo[12] = new Catalogo(13, "churrito Diana", 0.15, 30);
        catalogo[13] = new Catalogo(14, "cocacola", 1.25, 35);
        catalogo[14] = new Catalogo(15, "pepsi", 0.85, 25);
        catalogo[15] = new Catalogo(16, "naranjas", 0.3, 15);
        catalogo[16] = new Catalogo(17, "sandia", 3, 8);
        catalogo[17] = new Catalogo(18, "mandarina", 0.25, 2);
        catalogo[18] = new Catalogo(19, "melón", 2, 10);
        catalogo[19] = new Catalogo(20, "manzana", 0.35, 18);
        Scanner t = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("Bienvenido al sistema XYZ");
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Loguearse con usuario y contraseña");
            System.out.println("2. Salir y cerrar sistema");
            System.out.print("Digite la opcion: ");
            op = t.nextInt();
            switch (op) {
                case 1: {
                    ///LOGUEARSE
                    boolean isValid = l.ingresar();
                    if (isValid) {
                        switch (l.getTipoUsuario()) {
                            case "Admin":
                                b.crearBitacora(l);
                                m2.MenuAdmin(l, v, catalogo, contVentas);
                                break;
                            case "Vendedor":
                                b.crearBitacora(l);
                                m2.MenuVendedor(l, v, catalogo, contVentas);
                                break;
                            case "Invitado":
                                b.crearBitacora(l);
                                m2.MenuInvitado(l, v, catalogo, contVentas);
                                break;
                            default:
                                System.out.println("Error, no se encontro un tipo de usuario valido");
                                break;
                        }
                    }
                }
                break;
                case 2:
                    ///SALIR DEL SISTEMA
                    b.Comprimir();
                    System.out.println("Hasta la proxima......");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println();
        } while (op != 2);
    }
}
