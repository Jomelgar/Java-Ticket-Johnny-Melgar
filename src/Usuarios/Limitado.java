
package Usuarios;

/**
 *
 * @author jomel
 */
public final class Limitado extends Usuario{
    
    public Limitado(int Edad, String Nombre, String Contra, 
            String Username){
        super(Edad, Nombre, Contra, Username, Usuario.TipoUsuario.LIMITADO);
    }
}
