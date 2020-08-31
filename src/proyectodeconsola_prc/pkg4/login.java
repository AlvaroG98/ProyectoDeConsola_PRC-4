/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodeconsola_prc.pkg4;

/**
 *
 * @author Josue
 */
import java.util.Scanner;
public class login {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String usuario;
    String contrasena;
    

    System.out.println("Log In de Usuarios");
    System.out.print("Usuario: ");
    usuario = input.next();

    System.out.print("Contraseña: ");
    contrasena = input.next();;

    //users check = new users(username, password);

    if(usuario.equals(usuario) && contrasena.equals(contrasena)){ 
        System.out.println("Bienvenido de nuevo " + usuario);
    }
    else {
        System.out.println("Error al ingresar");
        }
    }
}

