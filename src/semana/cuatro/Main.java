/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.cuatro;

import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.ir.Symbol;

public class Main {

    static ArrayList<Persona> personas = new ArrayList<>();

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        String entrada = lector.nextLine(); //1&1022&Daniel
        String[] listaEntrada = entrada.split("&");

        while (!listaEntrada[0].equals("3")) {

            if (listaEntrada[0].equals("1")) {
                Persona persona = new Persona(Integer.parseInt(listaEntrada[1]), listaEntrada[2]);
                agregar(persona);
            } else {
                System.out.println(pintar());
            }

            entrada = lector.nextLine();
            listaEntrada = entrada.split("&");
        }

    }

    public static void agregar(Persona p) {
        personas.add(p);
    }

    public static ArrayList<Persona> pintar() {
        return personas;
    }
}
