/**
 * Created by Christian12 on 01/06/2018.
 */
public class Cuadrupla {
    int  estadoInicial;
    private String lectura;
    private String accion;
    int  estadoFinal;
    int repeticion;

    public Cuadrupla(int estadoInicial, String lectura, String accion, int estadoFinal) {
        this.estadoInicial = estadoInicial;
        this.lectura = lectura;
        this.accion = accion;
        this.estadoFinal = estadoFinal;

    }

    public int getEstadoInicial() {
        return estadoInicial;
    }

    public void setEstadoInicial(int estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public String getLectura() {
        return lectura;
    }

    public void setLectura(String lectura) {
        this.lectura = lectura;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public int getEstadoFinal() {
        return estadoFinal;
    }

    public void setEstadoFinal(int estadoFinal) {
        this.estadoFinal = estadoFinal;
    }

    public int getRepeticion() {
        return repeticion;
    }

    public void setRepeticion(int repeticion) {
        this.repeticion = repeticion;
    }

    public boolean compare(int estadoI, String lec, String act, int estadoF){
        if((estadoI== estadoInicial) &&(lec.equals(lectura)) && (accion.equals(act))&&(estadoF == estadoFinal)){
            return true;
        }
        return false;

    }
}
