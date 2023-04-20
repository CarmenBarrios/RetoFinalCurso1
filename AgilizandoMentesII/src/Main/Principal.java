/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import BBDD.ConexionBBDD;
import BBDD.MetodosUsuario;
import Login.Login;
import Usuario.Usuario;
import java.sql.*;

/**
 *
 * @author Grupo1 Cafe Con Palito
 * @author Carmen, Ramiro, Albano, Daniel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Main a1 = new Main();
        
        //a1.setVisible(true);
        
        ConexionBBDD conBD = new ConexionBBDD();
        Connection con = conBD.conectar();
        
        //Usuario user = new Usuario();
        
        String usuario = "Cbarrios";
        String contrasena = "12345";
        String DNI = "12345678T";
        String email = "123@asd.es";
        String alias = "AliasDaniel";
        String nombreUsuario ="Amartinez";
        System.out.println("Login Usuario " + MetodosUsuario.loginUsuario(con, usuario));
        System.out.println("Login Contraseña " + MetodosUsuario.loginContrasena(con, usuario, contrasena));
        System.out.println("DNI " + MetodosUsuario.comprobarDNI(con, DNI));
        System.out.println("Email " + MetodosUsuario.compobrarEmail(con, email));
        System.out.println("Alias " + MetodosUsuario.compobrarAlias(con, alias));
        System.out.println("Nombre Usuario " + MetodosUsuario.comprobarNombreUsuario(con, nombreUsuario));
        System.out.println("Es Profesor " + MetodosUsuario.comprobarEsProfesor(con, nombreUsuario));    

        
        conBD.desconectar();
    }
    
}
