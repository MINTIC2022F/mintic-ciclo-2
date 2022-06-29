/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunda.semana;

/**
 *
 * @author cdani
 */
public class Arreglos {

    public static void main(String[] args) {

        //Vectores
        String s = "a,b,c,d,e";
        String[] lista = new String[5];
        lista = s.split(",");
        //System.out.println(lista[3]);

        String[] arreglito = new String[3];
        arreglito[0] = "Paola";
        arreglito[1] = "Daniel";
        arreglito[2] = "Laura";

        String[] arreglito2 = {"luis", "pedro", "carlos"};

        //System.out.println("arreglito = "+arreglito);
        for (String elemento : arreglito) {
            //System.out.print(elemento+" ");
        }

        for (int i = 0; i < arreglito.length; i++) {
            //System.out.print(arreglito[i]+" ");

        }

        //Matrices
        int[][] matriz = new int[2][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

}
