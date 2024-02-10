
package Eventos;

import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author jomel
 */
public class Religioso extends Evento{
    private int Convertidos = -1;
    private final int MaxGente = 30_000;
    public final double Seguro = 2_000;
    private int Gente;
    
    public Religioso(String Codigo, String Titulo, String Descripcion,
            Calendar Fecha, Double Renta, int Gente){
        super(Codigo,Titulo, Descripcion, Fecha, Evento.TipoEvento.RELIGIOSO);
        this.Renta = evaluarRenta(Renta);
        this.Gente = evaluarGente(Gente);
        JOptionPane.showMessageDialog(null, "Recuerde, los eventos religiosos se le agregan 2000 Lps. por el seguro");
    }
    public int evaluarGente(int Gente){
        if(Gente > MaxGente){
            JOptionPane.showMessageDialog(null, 
                    "Se excedio la cantidad maxima para este tipo de clase, se pondra 30,000.");
            return MaxGente;
        }else{
            return Gente;
        }
    }
    
    public double evaluarRenta(double Renta){
        return Renta;
    }
    
     public void setEdicion(String Convertidos, String nada){
        this.Convertidos = Integer.parseInt(Convertidos);
    }

    public int getConvertidos() {
        return Convertidos;
    }

    public int getGente() {
        return Gente;
    }
     
     
}
