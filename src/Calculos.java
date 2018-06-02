import java.util.ArrayList;

/**
 * Created by Christian12 on 01/06/2018.
 */
public class Calculos {
    private ArrayList<Estado> maquina = new ArrayList<>();
    private ArrayList<Integer> indices = new ArrayList<>();
    private int estadoActual;
    private int cabezal;

    public Calculos(ArrayList<Estado> maquina) {
        this.maquina = maquina;
    }

    public void movimientoCuadrupla(String lectura){
        cabezal = 0;
        ArrayList<String> input = new ArrayList<>();
        for (int i = 0, n = lectura.length(); i < n; i++) {
            String s= new String(lectura.charAt(i) +"");
            input.add(s);
        }

        //Que hace cada estado? El estado es el conjunto de cuadruplas que comienzan con ese estado. De tal forma que
        // Podemos buscar por ID el estado para obtener las posibles cuadruplas
        int indiceEstado = indices.indexOf(estadoActual);
        Estado extraccionData = maquina.get(indiceEstado);
        String actualPosition = input.get(cabezal);

        for (Cuadrupla x: extraccionData.getCuadruplas()){
            //Verificar si el ID es el ingresado
            if(x.getLectura().equals(actualPosition)){

                String descripcionInstantantea = "--" + x.getEstadoInicial() + " " + x.getLectura()+ " " +
                                                x.getAccion() + " " + x.getEstadoFinal()+ " ";
                System.out.println(input);
                tomarAccion(x.getAccion(), input);
                estadoActual = x.getEstadoFinal();
                break;
            }
        }
    }

    public void  tomarAccion(String accion, ArrayList<String> data){
        if(accion.equals("L")){
            cabezal = cabezal-1;
        }
        else if(accion.equals("R")){
            cabezal = cabezal +1;
        }
        else{
            data.set(cabezal, accion);
        }

    }
}
