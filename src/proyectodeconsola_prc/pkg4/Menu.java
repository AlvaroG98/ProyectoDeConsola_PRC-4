package proyectodeconsola_prc.pkg4;
import java.util.Scanner;
import proyectodeconsola_prc.pkg4.login;
import proyectodeconsola_prc.pkg4.bitacora;
import proyectodeconsola_prc.pkg4.Ventas;
import proyectodeconsola_prc.pkg4.log;
public class Menu {

    //Atributos
    private Scanner teclado;

    public void MenuAdmin(login l, Ventas[] v, Catalogo[] catalogo, int contVentas, log lo) {
        int opcion = 0;
        
        bitacora b = new bitacora();
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
                case 1:
                    v[0].mostrarCatalogoVenta(catalogo);
                    v[contVentas].agregarProductos(catalogo, contVentas,l,lo);
                    break;
                case 2:
                    //CONSULTAR INVENTARIOS
                    v[0].consultarInventario(catalogo,l);
                    break;
                case 3:
                    //CAMBIAR CONTRASEÑA     
                    if(l.cambiarContraseña())
                    {
                        b.cerrarSesion(l,lo);
                        System.out.print("Volviendo a la pantalla de inicio de sesion");
                        opcion = 4;
                    }
                    break;
                case 4:
                    //SALIR DEL SISTEMA
                    b.cerrarSesion(l,lo);
                    System.out.println("Saliendo del sistema....");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println();
        } while (opcion != 4);
    }

    public void MenuVendedor(login l, Ventas[] v, Catalogo[] catalogo, int contVentas,log lo) {
        int opcion = 0;
        bitacora b = new bitacora();
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
                    v[0].mostrarCatalogoVenta(catalogo);
                    v[contVentas].agregarProductos(catalogo, contVentas,l,lo);
                }
                break;
                case 2:
                    //CONSULTAR INVENTARIOS
                    v[0].consultarInventario(catalogo,l);
                    break;
                case 3:
                    //SALIR DEL SISTEMA  
                    b.cerrarSesion(l,lo);
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println();
        } while (opcion != 3);
    }

    public void MenuInvitado(login l, Ventas[] v, Catalogo[] catalogo, int contVentas, log lo) {
        int opcion = 0;
        bitacora b = new bitacora();
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
                    v[0].mostrarCatalogoVenta(catalogo);
                }
                break;
                case 2:
                    //SALIR DEL SISTEMA   
                    b.cerrarSesion(l,lo);
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println();
        } while (opcion != 2);
    }

}
