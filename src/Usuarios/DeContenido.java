package Usuarios;

import java.util.ArrayList;

/**
 *
 * @author jomel
 */
public class DeContenido extends Usuario{
    private ArrayList<String> Codigos = new ArrayList();
    
    public DeContenido(int Edad, String Nombre, String Contra, 
            String Username){
        super(Edad, Nombre, Contra, Username, Usuario.TipoUsuario.DECONTENIDO);
        
    }
    
    public boolean esLimitado(){
        return false;
    }
    
    public void agregarCodigo(String ID){
        Codigos.add(ID);
    }
    
    public void eliminarCodigo(String ID){
        Codigos.remove(ID);
    }

    public ArrayList<String> getCodigos() {
        return Codigos;
    }

    public void setCodigos(ArrayList<String> Codigos) {
        this.Codigos = Codigos;
    }
    
    
}
