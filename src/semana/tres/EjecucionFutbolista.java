/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.tres;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author cdani
 */
public class EjecucionFutbolista {

    public static void main(String[] args) {

        Futbolista f1 = new Futbolista(9, "Falcao", true);
        Futbolista f2 = new Futbolista(10, "James", false);
        Futbolista f3 = new Futbolista(1, "Ospina", false);
        Futbolista f4 = new Futbolista(4, "Arias", true);

        ArrayList<Futbolista> futbolistas = new ArrayList<>();
        futbolistas.add(f1);
        futbolistas.add(f2);

        Equipo equipo = new Equipo("Colombia", futbolistas);

        equipo.agregarFutbolista(f3);
        equipo.agregarFutbolista(f4);

        //equipo.suspenderFutbolista(f2);
        //equipo.suspenderFutbolista(f4);
        Futbolista f22 = new Futbolista(20, "James", false);

        System.out.println(equipo.getFutbolistas());
        System.out.println(equipo.consultarFutbolistasLesionados());
        equipo.actualizarFutbolista(f22);
        equipo.agregarFutbolista(new Futbolista(10, "Cardona", false));
        System.out.println(equipo.getFutbolistas());

        ArrayList<Futbolista> fLista = equipo.getFutbolistas();
        Futbolista futbolistaDevuelto = fLista.get(4);
        System.out.println(futbolistaDevuelto);
        System.out.println(fLista.size());
        
        HashMap<Integer, String> directorio= new HashMap <>();
        directorio.put(4644350, "Daniel Salazar");
    

    }
}
