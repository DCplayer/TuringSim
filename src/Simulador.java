import java.util.ArrayList;
import java.util.HashSet;
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
        String input = "";
        HashSet<Integer> estados = new HashSet<>();

        while(pregunta){
            System.out.println("-------------------ALFABETO-------------------\nIngrese el simbolo del alfabeto a ingresar: ");
            String s = scanner.nextLine();
            if(alfabeto.contains(s) || s.equals("B") || s.equals("R") || s.equals("L")){
                System.out.println("Ese valor no es valido por su existencia en el alfabeto o es un simbolo reservado");
            }
            else{
                alfabeto.add(s);
            }
            System.out.println("Quiere seguir ingresando Simboloas?: S/N");
            String respuesta = scanner.nextLine();

            if(respuesta.equals("N") || respuesta.equals("n") || respuesta.equals("N ") || respuesta.equals("n ")){
                pregunta = false;
            }
        }
        pregunta = true;

        while (pregunta){
            System.out.println("-------------------CUADRUPLA-------------------\nIngrese el estado inicial de la cuadrupla (int): ");
            int init = scanner.nextInt();
            estados.add(init);

            System.out.println("Ingrese el item de lectura que tendra este estado (String): ");
            String lect = scanner.next();

            System.out.println("Ingrese la accion que se tomara en la cuadrupa (String): ");
            String acti = scanner.next();

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
            String respuesta = scanner.next();
            if(respuesta.equals("N") || respuesta.equals("n") || respuesta.equals("N ") || respuesta.equals("n ")){
                pregunta = false;
            }
        }
        pregunta = true;
        System.out.println("-------------------INPUT-------------------");
        input = scanner.next();

        System.out.println("-------------------ESTADO INICIAL-------------------");
        int estadoInicial = scanner.nextInt();



        ArrayList<Estado> estadosUnidos = new ArrayList<>();
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i: estados){
            ArrayList<Cuadrupla> cuadruplasPue = new ArrayList<>();
            for (Cuadrupla cc: cuadruplas){
                if(cc.getEstadoInicial() == i){
                    cuadruplasPue.add(cc);
                }

            }
            Estado estado = new Estado(cuadruplasPue, i);
            estadosUnidos.add(estado);
            indices.add(i);
        }

        Calculos calculos = new Calculos(estadosUnidos, indices, estadoInicial);
        calculos.movimientoCuadrupla(input);







    }
}
