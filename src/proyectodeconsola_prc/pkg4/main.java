package proyectodeconsola_prc.pkg4;

import proyectodeconsola_prc.pkg4.login;
import proyectodeconsola_prc.pkg4.Menu;

public class main {

    public static void main(String[] args) {
        login l = new login();
        Menu m = new Menu();
        while (!l.ingresar()); //El while permite que el login se repita sin parar hasta que se ingrese correctamente
        switch (l.getTipoUsuario())//A través del switch se manejaran los alcances de cada usuario
        {
            case "Admin":
                m.inicializar();
                break;
            case "Vendedor":
                m.inicializar();
                break;
            case "Invitado":
                m.inicializar();
                break;
            default:
                System.out.println("Error, no se encontro un tipo de usuario valido");
                break;
        }
    }
}