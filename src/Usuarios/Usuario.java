
package Usuarios;


public class Usuario {
    private int Edad;
    private String Nombre;
    private String Contra;
    private String Username;
    private TipoUsuario tipo;
    
    public int getEdad() {
        return Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getContra() {
        return Contra;
    }

    public String getUsername() {
        return Username;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }
    
    
    public Usuario(int Edad, String Nombre, String Contra, String Username, TipoUsuario tipo){
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Contra = Contra;
        this.Username = Username;
        this.tipo = tipo;
    }
    
    public enum TipoUsuario{
        ADMINISTRADOR, DECONTENIDO, LIMITADO;
    }
        
    public boolean esLimitado(){
        return true;
    }
    
    public String toString(){
        return "Nombre: "+ Nombre +" Edad: "+ Edad +"\nContraseña: "+ Contra+" Tipo: " + tipo.toString();
    }
}
