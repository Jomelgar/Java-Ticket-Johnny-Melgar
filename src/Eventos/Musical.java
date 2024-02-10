
package Eventos;

import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author jomel
 */
public class Musical extends Evento{
    private TipoMusical Tipo;
    private final int MaxGente = 25_000;
    public final double Seguro;
    private int Gente;
    private String Personas;
    private String Cargos;
    
    public enum TipoMusical{
        CLASICA, POP, ROCK, REGGAETON, RAP, OTRO;
    }
    
    public Musical(String Codigo, String Titulo, String Descripcion,
            Calendar Fecha, Double Renta, int Gente, TipoMusical Tipo){
        super(Codigo,Titulo, Descripcion, Fecha, Evento.TipoEvento.MUSICAL);
        Seguro = Renta * 0.3;
        this.Renta = Renta;
        this.Tipo = Tipo;
        this.Gente = evaluarGente(Gente);
    }
    
    public int evaluarGente(int Gente){
        if(Gente > MaxGente){
            JOptionPane.showMessageDialog(null, 
                    "Se excedio la cantidad maxima para este tipo de clase, se pondra 25,000.");
            return MaxGente;
        }else{
            return Gente;
        }
    }
    
    public void setEdicion(String Personas, String Cargos){
        this.Personas = Personas;
        this.Cargos = Cargos;
    }

    public int getGente() {
        return Gente;
    }

    public TipoMusical getTipo() {
        return Tipo;
    }

    public String getPersonas() {
        return Personas;
    }

    public String getCargos() {
        return Cargos;
    }
    
    
}
