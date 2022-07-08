
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.tres;

import java.util.ArrayList;

/**
 *
 * @author cdani
 */
public class EjemploArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros= new ArrayList<>();
        listaEnteros.add(5);
        listaEnteros.add(7);
        listaEnteros.add(3);
        
        System.out.println(listaEnteros);
        
        System.out.println(listaEnteros.get(2));
    }

}
