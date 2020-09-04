package proyectodeconsola_prc.pkg4;

import java.io.*;
import java.util.Scanner;
import java.nio.file.*;

public class login {

    //atributos privados
    private Scanner scn = new Scanner(System.in);
    private String usuario;
    private String contrasena;
    private String tipoUsuario;
    private String[][] dbUsers = new String[9][4];
    private int cont;

    //Primer constructor
    public login() {
        this.usuario = "";
        this.contrasena = "";
        this.tipoUsuario = "";
        this.cont = 0;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    ///Usado para mostrar todos los usuarios guardados en la matriz y comproba que funciona, 
    ///luego servira para que el admin cambie contraseña
    public void mostrar() {
        for (int i = 0; i < cont; i++) {
            System.out.println(this.dbUsers[i][0] + " " + this.dbUsers[i][1] + " " + this.dbUsers[i][2] + " " + this.dbUsers[i][3]);
        }
    }

    ///ingresar permite hacer el login, si este es correcto devuelve verdadero, de lo contrario falso
    public boolean ingresar() {
        boolean resultado = false; // para comprobar si cuenta y pass no coindicen con ninguna línea 
        String record = null;
        FileReader in = null;
        //Se comprueba que el archivo con los usuarios exista, si no existe se puede agregar mientras el
        //programa aun esta corriendo antes de presionar enter
        if (!Files.exists(Paths.get("users.txt"))) {
            System.out.println("El archivo de texto no se encontro, devuelvalo a su lugar");
            System.out.println("Presione enter para continuar...");
            new java.util.Scanner(System.in).nextLine();
        }
        try {
            in = new FileReader("users.txt");
            BufferedReader br = new BufferedReader(in);

            //Leer usuario y contraseña
            System.out.println("Bienvenido al sistema de ventas.");
            System.out.println("Favor ingresar credenciales.");
            System.out.print("Usuario: ");
            this.usuario = scn.nextLine();
            System.out.print("Contrasena: ");
            this.contrasena = scn.nextLine();

            while ((record = br.readLine()) != null) //el while leera todo el documento
            {
                String[] palabra = record.split(","); // dividir en palabras delimitadas por espacios
                //aca abajo se rellena la matriz de usuarios
                this.dbUsers[cont][0] = Integer.toString(cont + 1);
                this.dbUsers[cont][1] = palabra[0];
                this.dbUsers[cont][2] = palabra[1];
                this.dbUsers[cont][3] = palabra[2];
                if (palabra[1].equals(this.usuario) && palabra[2].equals(this.contrasena)) //Comprueba que el usuario y contraseña coincidan con alguno guardado en el txt
                {
                    resultado = true;
                    this.tipoUsuario = palabra[0];
                    System.out.println("Bienvenido otra vez " + this.usuario);
                }
                this.cont++;
            }

            if (!resultado)//Cuando no coincide usuario y contraseña
            {
                System.out.println("Usuario o contraseña incorrecto.");
            }
            in.close();
        } catch (IOException e) {
            e.getCause();
        }
        return resultado;
    }
}