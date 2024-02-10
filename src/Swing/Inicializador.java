
package Swing;

import Usuarios.GestorUsuarios;
import Eventos.GestorEventos;

/**
 *
 * @author jomel
 */
public class Inicializador {
    
    //Inicializador de Objetos
    //ADMIN - admin - supersecreto
   public static GestorUsuarios GestorUsuarios = new GestorUsuarios();
   public static GestorEventos GestorEventos = new GestorEventos();
   public static Usuarios.Usuario usuario;
    public static void main(String[] args) {
        LogIn inicio = new LogIn();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
    }
    
}
