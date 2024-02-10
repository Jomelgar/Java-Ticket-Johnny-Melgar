
package Eventos;

import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author jomel
 */
public class Deporte extends Evento{
    private TipoDeporte Tipo;
    private String Equipo1;
    private String Equipo2;
    private int Gente; 
    //Atributo final.
    private final int MaxGente = 20_000;
    
    public Deporte(String Codigo, String Titulo, String Descripcion,
            Calendar Fecha, Double Renta, int Gente, TipoDeporte Tipo){
        super(Codigo,Titulo, Descripcion, Fecha,Evento.TipoEvento.DEPORTE);
        this.Tipo = Tipo;
        this.Renta = Renta;
        this.Gente = evaluarGente(Gente);
    }
    
    public enum TipoDeporte{
        FUTBOL, TENIS, RUGBY, BASEBALL;
    }
    
    public int evaluarGente(int Gente){
        if(Gente > MaxGente){
            JOptionPane.showMessageDialog(null, 
                    "Se excedio la cantidad maxima para este tipo de clase, se pondra 20,000.");
            return MaxGente;
        }else{
            return Gente;
        }
    }
    
    
    public void setEdicion(String Equipo1, String Equipo2){
        this.Equipo1 = Equipo1;
        this.Equipo2 = Equipo2;
    }

    public int getGente() {
        return Gente;
    }

    public String getEquipo1() {
        return Equipo1;
    }

    public String getEquipo2() {
        return Equipo2;
    }

    public TipoDeporte getTipo() {
        return Tipo;
    }
    
    
}
