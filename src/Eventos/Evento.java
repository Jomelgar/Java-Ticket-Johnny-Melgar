
package Eventos;

import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author jomel
 */

//Clase abstracta con su funcion EvsGente() abstracta.
public abstract class Evento {
    private String Codigo;
    private String Titulo;
    private String Descripcion;
    private Calendar Fecha;
    protected Double Renta;
    private TipoEvento TipoEvt;
    public boolean Cancelado = false;
    
    public enum TipoEvento{
        DEPORTE,MUSICAL,RELIGIOSO; 
    }
    
    public Evento(String Codigo, String Titulo, String Descripcion,
            Calendar Fecha, TipoEvento TipoEvt){
        this.Codigo = Codigo;
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
        this.TipoEvt = TipoEvt;
    }
    
    public String imprimir(){
        return "Código: " + Codigo + " Tipo: " + TipoEvt + " Título: " + Titulo + " Fecha: " + new SimpleDateFormat("dd/MM/yy").format(Fecha.getTime());
    }
    
    //Abstracta para retornar la gente de las hijas.
    public abstract int getGente();
    //Abstracta para añadir los valores necesarios a atributos hijos.
    public abstract void setEdicion(String Ranura1, String Ranura2);
    
    public String getCodigo() {
        return Codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public Calendar getFecha() {
        return Fecha;
    }

    public Double getRenta() {
        return Renta;
    }    

    public TipoEvento getTipoEvt() {
        return TipoEvt;
    }
    
}
