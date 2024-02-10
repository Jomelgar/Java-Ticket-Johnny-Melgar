
package Eventos;

import Usuarios.Administrador;
import Usuarios.DeContenido;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author jomel
 */
public class GestorEventos {
    public ArrayList<Evento> eventos;
    public double[] multas = new double[6];
    public GestorEventos(){
        eventos = new ArrayList();
        multas[0] = 0; 
        multas[1] = 0; 
        multas[5] = 0;
        multas[2] = 0; 
        multas[3] = 0; 
        multas[4] = 0; 
    }
    
    public void AgregarEvento(Evento evento){
        if(busquedaCodigo(evento.getCodigo()) == null){
            eventos.add(evento);
            JOptionPane.showMessageDialog(null, "Evento creado con exito.\n"
                    + "Su código es:  " + evento.getCodigo());
        }else{
            JOptionPane.showMessageDialog(null, "El evento no pudo ser creado.");
        }
    }
    
    public Evento busquedaCodigo(String ID){
        return busquedaCodigo(ID, 0);
    }
    
    //Recursiva
    private Evento busquedaCodigo(String ID, int pos){
        if(pos < eventos.size()){
            if(eventos.get(pos).getCodigo().equals(ID)){
                return eventos.get(pos);
            }
            return busquedaCodigo(ID, pos+1);
        }
        return null;
    }
    
    public boolean CancelarEvento(Evento evento){
        Evento Acancelar = busquedaCodigo(evento.getCodigo());
        if( Acancelar != null){
            if(Calendar.getInstance().before(Acancelar.getFecha())){
                int ind = eventos.indexOf(Acancelar);
                if(eventos.get(ind).getTipoEvt().equals(Evento.TipoEvento.DEPORTE)){
                    multas[0] += eventos.get(ind).getRenta() * 0.5;
                    multas[3] ++;
                }
                else if(eventos.get(ind).getTipoEvt().equals(Evento.TipoEvento.MUSICAL)){
                    multas[1] += eventos.get(ind).getRenta() * 0.5;
                    multas[4]++;
                }else{
                    multas[5]++;
                }
                eventos.get(ind).Cancelado = true;
                return true;
            }
            return false;
        }
        return false;
    }
    
    public boolean estaCancelado(String ID){
        if(busquedaCodigo(ID).Cancelado){
            return true;
        }
        return false;
    }
    public void EditarEvento(Evento evento){
        eventos.set(conseguirPosicion(evento), evento);
    }
    
    public int conseguirPosicion(Evento evento){
        return conseguirPosicion(evento.getCodigo(),0);
    }
    
    //Recursiva
    private int conseguirPosicion(String ID,int pos){
        if(!eventos.get(pos).getCodigo().equals(ID)){
            return conseguirPosicion(ID, pos+1);
        }
        return pos;
    }
    
    private String getCodigoUsuario(String var, Usuarios.Usuario usuario, int posU){
        if(usuario instanceof Usuarios.Administrador || usuario instanceof Usuarios.DeContenido){
            ArrayList<String> codigoU = new ArrayList();
            if(usuario.getTipo().equals(Usuarios.Usuario.TipoUsuario.ADMINISTRADOR)){
               Administrador admin = (Administrador)usuario;
               codigoU = admin.getCodigos();
            }else{
                DeContenido admin = (DeContenido)usuario;
                codigoU = admin.getCodigos();
            }
            if(posU<codigoU.size()){
                Evento evento = busquedaCodigo(codigoU.get(posU));
                var += evento.imprimir();
                if(evento.getFecha().before(Calendar.getInstance())){
                    var += " Estado: " + "No realizado";
                }else{
                    var += " Estado: " + "Realizado";
                }
                var += " Monto: Lps."+ evento.getRenta() +"\n";
                return getCodigoUsuario(var, usuario, posU +1);
            }else if(codigoU.size() == 0){
                return "No hay eventos registrados en este usuario.";
            }
            return var;
        }
        return "Este Usuario es limitado, por lo tanto no tiene codigos.";
    }
    
    public String getCodigoUsuario(Usuarios.Usuario usuario){
        return getCodigoUsuario("",usuario,0);
    }
    
    public double[] getEventosReal(){
        double[] arreglo = new double[6];
        arreglo[0] = 0;
        arreglo[1] = 0;
        arreglo[2] = 0;
        arreglo[3] = 0;
        arreglo[4] = 0;
        arreglo[5] = 0;
        return getEventosReal(arreglo, 0);
    }
    
    private double[] getEventosReal(double[] arreglo, int pos){
        if(pos < eventos.size()){
            Evento evento = eventos.get(pos);
            if(evento.getTipoEvt().equals(Evento.TipoEvento.DEPORTE) && !evento.Cancelado){
                if(evento.getFecha().before(Calendar.getInstance())){
                    arreglo[0] += evento.getRenta();
                    arreglo[3]++;
                }
                return getEventosReal(arreglo, pos + 1);
            }else if(evento.getTipoEvt().equals(Evento.TipoEvento.MUSICAL) && !evento.Cancelado){
                if(evento.getFecha().before(Calendar.getInstance())){
                    arreglo[1] += evento.getRenta();
                    arreglo[4]++;
                }
                return getEventosReal(arreglo, pos + 1);
            }else{
                if(evento.getFecha().before(Calendar.getInstance()) && !evento.Cancelado){
                    arreglo[2] += evento.getRenta() + 2_000;
                    arreglo[5]++;
                }
                return getEventosReal(arreglo, pos + 1);
            }
        }
        return arreglo;
    }
    
    public double[] getEventosFuturos(){
        double[] arreglo = new double[6];
        arreglo[0] = 0;
        arreglo[1] = 0;
        arreglo[2] = 0;
        arreglo[3] = 0;
        arreglo[4] = 0;
        arreglo[5] = 0;
        return getEventosFuturos(arreglo, 0);
    }
    
    private double[] getEventosFuturos(double[] arreglo, int pos){
        if(pos < eventos.size()){
            Evento evento = eventos.get(pos);
            if(evento.getTipoEvt().equals(Evento.TipoEvento.DEPORTE) && !evento.Cancelado){
                if(evento.getFecha().after(Calendar.getInstance())){
                   arreglo[0] += evento.getRenta();
                   arreglo[3]++;
                }
                return getEventosFuturos(arreglo, pos + 1);
            }else if(evento.getTipoEvt().equals(Evento.TipoEvento.MUSICAL) && !evento.Cancelado){
                if(evento.getFecha().after(Calendar.getInstance())){
                   arreglo[1] += evento.getRenta();
                   arreglo[4]++;
                }
                return getEventosFuturos(arreglo, pos + 1);
            }else{
                if(evento.getFecha().after(Calendar.getInstance()) && !evento.Cancelado){
                   arreglo[2] += evento.getRenta() + 2_000; 
                   arreglo[5]++;
                }
                return getEventosFuturos(arreglo, pos + 1);
            }
        }
        return arreglo;
    }
    
    public double[] getFechaSelecc(Calendar inicio, Calendar fin){
        double[] arreglo = new double[6];
        arreglo[0] = 0;
        arreglo[1] = 0;
        arreglo[2] = 0;
        arreglo[3] = 0;
        arreglo[4] = 0;
        arreglo[5] = 0;
        return getFechaSelecc(arreglo, 0, inicio, fin);
    }
    
    private double[] getFechaSelecc(double[] arreglo, int pos, Calendar inicio, Calendar fin){
        if(pos < eventos.size()){
            Evento evento = eventos.get(pos);
            if(evento.getTipoEvt().equals(Evento.TipoEvento.DEPORTE)){
                if(inicio.before(evento.getFecha()) && fin.after(evento.getFecha())&& !evento.Cancelado){
                    arreglo[0] += evento.getRenta();
                    arreglo[3] ++;
                }
                return getFechaSelecc(arreglo, pos + 1, inicio, fin);
            }else if(evento.getTipoEvt().equals(Evento.TipoEvento.MUSICAL)){
                if(inicio.before(evento.getFecha()) && fin.after(evento.getFecha())&& !evento.Cancelado){
                    arreglo[1] += evento.getRenta();
                    arreglo[4] ++;
                }
                return getFechaSelecc(arreglo, pos + 1, inicio, fin);
            }else{
                if(inicio.before(evento.getFecha()) && fin.after(evento.getFecha())&& !evento.Cancelado){
                    arreglo[2] += evento.getRenta() + 2_000;
                    arreglo[5] ++;
                }
                return getFechaSelecc(arreglo, pos + 1, inicio, fin);
            }
        }
        arreglo[0] += multas[0];
        arreglo[1] += multas[1];
        arreglo[3] += multas[2];
        arreglo[4] += multas[3];
        arreglo[5] += multas[4];
        return arreglo;
    }
    
    public String fechaSelecc(Calendar inicio, Calendar fin){
        return fechaSelecc(eventos.size() - 1, "", inicio, fin);
    }
    private String fechaSelecc(int pos, String texto, Calendar inicio, Calendar fin){
        if(eventos.size() > 0 ){
            if(pos>= 0){
                if(inicio.before(eventos.get(pos).getFecha()) && fin.after(eventos.get(pos).getFecha())){
                    texto += eventos.get(pos).imprimir() + "\n";
                }
                return fechaSelecc(pos-1,texto,inicio,fin);
            }
            return texto;
        }
        return "No hay ningun evento disponible para inspeccionar.";
    }
    
    public String EventoReal(){
        if(eventos.size()>0)
            return EventoReal(eventos.size() - 1, "");
        return "No hay eventos disponibles.";
    }
    
    private String EventoReal(int pos, String texto){
        Calendar hoy = Calendar.getInstance();
        if(pos>= 0){
            if(hoy.after(eventos.get(pos).getFecha()) && !eventos.get(pos).Cancelado){
                texto += eventos.get(pos).imprimir() + " Monto: Lps." + eventos.get(pos).getRenta() + "\n";
            }
            return EventoReal(pos - 1, texto);
        }
        return texto;
    }
    
    public String EventoFuturos(){
        if(eventos.size()>0)
            return EventoFuturos(eventos.size() - 1, "");
        return "No hay eventos disponibles.";
    }
    
    private String EventoFuturos(int pos, String texto){
        Calendar hoy = Calendar.getInstance();
        if(pos>= 0){
            if(hoy.before(eventos.get(pos).getFecha()) && !eventos.get(pos).Cancelado){
                texto += eventos.get(pos).imprimir() + " Monto: Lps." + eventos.get(pos).getRenta() + "\n";
            }
            return EventoFuturos(pos - 1, texto);
        }
        return texto;
    }
    
    public String EventoCancelado(){
        if(eventos.size()>0)
            return EventoCancelado(eventos.size() - 1, "");
        return "No hay eventos disponibles.";
    }
    private String EventoCancelado(int pos , String texto){
        if(pos>=0){
            if(eventos.get(pos).Cancelado){
                if(eventos.get(pos) instanceof Religioso){
                    texto += eventos.get(pos).imprimir() + "Multa: Lps."+ 0 + "\n";
                }else{
                    texto += eventos.get(pos).imprimir() + "Multa: Lps."+ eventos.get(pos).getRenta() * 0.5 + "\n";
                }
            }
            return EventoCancelado(pos -1, texto);
        }
        if(texto.isEmpty()){
            return "No hay eventos cancelados.";
        }
        return texto;
    }
}
