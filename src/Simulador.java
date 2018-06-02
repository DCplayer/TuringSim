import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Christian12 on 01/06/2018.
 */
public class Simulador {
    public static void main(String args[]){
        ArrayList<Cuadrupla> cuadruplas = new ArrayList<>();
        ArrayList<String> alfabeto = new ArrayList<>();
        boolean pregunta = true;
        Scanner scanner = new Scanner(System.in);

        while(pregunta){
            System.out.println("Ingrese el simbolo del alfabeto a ingresar: ");
            String s = scanner.nextLine();

            System.out.println("Quiere seguir ingresando Simboloas?: S/N");
            String respuesta = scanner.nextLine();
            if(respuesta.equals("N") || respuesta.equals("n") || respuesta.equals("N ") || respuesta.equals("n ")){
                pregunta = false;
            }
        }
        pregunta = true;

        while (pregunta){
            System.out.println("CUADRUPLA\nIngrese el estado inicial de la cuadrupla (int): ");
            int init = scanner.nextInt();
            System.out.println("Ingrese el item de lectura que tendra este estado (String): ");
            String lect = scanner.nextLine();
            System.out.println("Ingrese la accion que se tomara en la cuadrupa (String): ");
            String acti = scanner.nextLine();
            System.out.println("Ingrese el estado final de la cuadrupla correspondiente (int): ");
            int ende = scanner.nextInt();

            Cuadrupla cu = new Cuadrupla(init, lect, acti, ende );
            if(cuadruplas.contains(cu)){
                System.out.println("ERROR: La cuadrupla declarada ya fue ingresada con anterioridad");
            }
            else{
                cuadruplas.add(cu);
            }

            System.out.println("Quiere seguir ingresando Cuadruplas?: S/N");
            String respuesta = scanner.nextLine();
            if(respuesta.equals("N") || respuesta.equals("n") || respuesta.equals("N ") || respuesta.equals("n ")){
                pregunta = false;
            }
        }
        pregunta = true;





    }
}
