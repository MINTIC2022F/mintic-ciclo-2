package semana.cuatro;

import java.util.ArrayList;

public class ManejoListas {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(7);
        lista.add(1);
        lista.add(9);
        lista.add(20);

        System.out.println(obtenerMayor(lista));

    }

    public static int obtenerMayor(ArrayList<Integer> listaNumeros) {
        int mayor = 0;
//        for(int i=0; i<listaNumeros.size();i++){
//            if(listaNumeros.get(i)>mayor){
//                mayor=listaNumeros.get(i);
//            }
//        }
//        return mayor;

        for (Integer elemento : listaNumeros) {
            if (elemento > mayor) {
                mayor = elemento;
            }
        }
        return mayor;
    }

}
