import java.util.ArrayList;

/**
 * Created by Christian12 on 01/06/2018.
 */
public class Estado {
    private ArrayList<Cuadrupla> cuadruplas = new ArrayList<>();
    private int id;

    public Estado(ArrayList<Cuadrupla> cuadruplas, int id) {
        this.cuadruplas = cuadruplas;
        this.id = id;
    }

    public ArrayList<Cuadrupla> getCuadruplas() {
        return cuadruplas;
    }

    public void setCuadruplas(ArrayList<Cuadrupla> cuadruplas) {
        this.cuadruplas = cuadruplas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
