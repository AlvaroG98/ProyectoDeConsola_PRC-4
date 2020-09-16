package proyectodeconsola_prc.pkg4;

import java.util.Scanner;
import proyectodeconsola_prc.pkg4.login;
import proyectodeconsola_prc.pkg4.Menu;

public class main {

    public static void main(String[] args) {
       login l = new login(); 
        Scanner t = new Scanner(System.in);
        Catalogo c3[] =new Catalogo[10];
        c3[0]=new Catalogo(1,"Huevos",0.1,30);
        c3[1]=new Catalogo(2,"Pollo",5,15);
        c3[2]=new Catalogo(3,"Aceite",3,40);
        c3[3]=new Catalogo(4,"Fosforos",0.5,50);
        c3[4]=new Catalogo(5,"Dulces",0.8,83);
        c3[5]=new Catalogo(6,"Margarina",0.3,30);
        c3[6]=new Catalogo(7,"Jabon",2.25,35);
        c3[7]=new Catalogo(8,"Carne",2.75,15);
        c3[8]=new Catalogo(9,"Gaseosa",1.80,20);
        c3[9]=new Catalogo(10,"Desechables",3.25,10);
        Menu m2 = new Menu(c3);
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
                        switch (l.getTipoUsuario())
                        {
                            case "Admin":
                                m2.MenuAdmin();
                                break;
                            case "Vendedor":
                                m2.MenuVendedor();
                                break;
                            case "Invitado":
                                m2.MenuInvitado();
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
