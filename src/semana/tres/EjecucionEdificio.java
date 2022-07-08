/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.tres;

/**
 *
 * @author cdani
 */
public class EjecucionEdificio {
    public static void main(String[] args) {
        
        Apartamento apto1=new Apartamento("Cocina de lujo", 43.2, 1001);
        Apartamento apto2=new Apartamento("Cocina sencilla", 43.2, 811);
        
        Apartamento[] apartamentos=new Apartamento[2];
        apartamentos[0]=apto1;
        apartamentos[1]=apto2;
        
        Edificio edificio = new Edificio("Zona sur", "Bloque", apartamentos);
        
        System.out.println(edificio);
        
    }
}
