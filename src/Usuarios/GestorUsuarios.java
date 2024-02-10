
package Usuarios;

import java.util.ArrayList;

/**
 *
 * @author jomel
 */
public class GestorUsuarios {
    private ArrayList<Usuario> Cuentas = new ArrayList();
    
    public GestorUsuarios(){
        //Creacion de la cuenta admin
        Cuentas.add(new Administrador(18,"Administrador", 
                "supersecreto", "admin"));
    }
    //Recursividad con Método Down
    private boolean agregarUsuario(int posicion, Usuario usuario){
        if(posicion >= 0){
            if(!Cuentas.get(posicion).getUsername()
                    .equals(usuario.getUsername())){
                return agregarUsuario(posicion - 1, usuario);
            }
            
            return false;
        }
        Cuentas.add(usuario);
        return true;
    }
    
//Funcion final.
    public final boolean agregarUsuario(Usuario usuario){
        return agregarUsuario(Cuentas.size() - 1, usuario);
    }
        
    //Recursividad con Método Down(Ya que no tiene acumulado nungun valor)
    private Usuario BusquedaUsuario(String Username, String Contra, int posicion){
        if(posicion >= 0){
            if(!Cuentas.get(posicion).getUsername().equals(Username)
                    || !Cuentas.get(posicion).getContra().equals(Contra)){
                return BusquedaUsuario(Username, Contra, posicion - 1);
            }
            return Cuentas.get(posicion);
        }
        return null;
    }
    
    public Usuario BusquedaUsuario(String Username, String Contra){
        return BusquedaUsuario(Username, Contra, Cuentas.size() - 1);
    }
    
    
    public void EditarUsuario(Usuario usuario, int posicion){
            //Agregar los codigos. :D
            if(!usuario.esLimitado() && !Cuentas.get(posicion).esLimitado()){
                if(Cuentas.get(posicion).getTipo().equals(Usuario.TipoUsuario.ADMINISTRADOR)){
                    if(usuario.getTipo().equals(Usuario.TipoUsuario.ADMINISTRADOR)){
                        Administrador admin= (Administrador)usuario;
                        Administrador anade = (Administrador)Cuentas.get(posicion);
                        admin.setCodigos(anade.getCodigos());
                        usuario = admin;
                    }else{
                        DeContenido admin= (DeContenido)usuario;
                        Administrador anade = (Administrador)Cuentas.get(posicion);
                        admin.setCodigos(anade.getCodigos());
                        usuario = admin;
                    }
                }else{
                    if(usuario.getTipo().equals(Usuario.TipoUsuario.ADMINISTRADOR)){
                       Administrador admin= (Administrador)usuario;
                        DeContenido anade = (DeContenido)Cuentas.get(posicion);
                        admin.setCodigos(anade.getCodigos());
                        usuario = admin; 
                    }else{
                        DeContenido admin= (DeContenido)usuario;
                        DeContenido anade = (DeContenido)Cuentas.get(posicion);
                        admin.setCodigos(anade.getCodigos());
                        usuario = admin; 
                    }
                }
            }
            Cuentas.set(posicion, usuario);
    }
    
    public void EliminarUsuario(Usuario usuario){
        EliminarUsuario(usuario,1);
    }
    
    private void EliminarUsuario(Usuario usuario, int posicion){
        if(!Cuentas.get(posicion).equals(usuario)){
            EliminarUsuario(usuario,posicion +1);
        }else{
            Cuentas.remove(posicion);
        }
        
    }
    
    public Usuario AgregarCodigo(Usuario usuario, String ID){
        return AgregarCodigo(usuario,ID,0);
    }
    
    private Usuario AgregarCodigo(Usuario usuario,String ID, int pos){
        if(usuario.equals(Cuentas.get(pos))){
            if(Cuentas.get(pos).getTipo().equals(Usuario.TipoUsuario.ADMINISTRADOR)){
                 Administrador admin = (Administrador)Cuentas.get(pos);
                 admin.agregarCodigo(ID);
                 Cuentas.set(pos, admin);
                 System.out.println("Codigo " + ID + " agregado a " + usuario.getNombre());
                 return admin;
            }else{
                DeContenido admin = (DeContenido)Cuentas.get(pos);
                 admin.agregarCodigo(ID);
                 Cuentas.set(pos,admin);
                 System.out.println("Codigo " + ID + " agregado a " + usuario.getNombre());
                 return admin;
            }
        }
            return AgregarCodigo(usuario,ID,pos+1);
        
    }
    
    public boolean busquedaCodigo(Usuario usuario, String ID, Eventos.GestorEventos gestor){
        if(usuario.getTipo().equals(Usuario.TipoUsuario.ADMINISTRADOR)){
            Administrador admin = (Administrador)usuario;
                return admin.getCodigos().contains(ID) && !gestor.busquedaCodigo(ID).Cancelado;
        }else if(usuario.getTipo().equals(Usuario.TipoUsuario.DECONTENIDO)){
            DeContenido admin = (DeContenido)usuario;
                return admin.getCodigos().contains(ID) && !gestor.busquedaCodigo(ID).Cancelado;
        }
        return false;
    }
    
    //Recursividad
    private int indice(Usuario usuario, int pos){
        if(Cuentas.get(pos).equals(usuario)){
            return pos;
        }
        return indice(usuario, pos + 1);
    }
    public int indice(Usuario usuario){
        return indice(usuario, 1);
    }
    
    
}
