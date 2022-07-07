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
public class EjecucionTiendaInstrumentos {
    
    public static void main(String[] args) {
        Guitarra guitarra=new Guitarra("Cuerdas de acero");
        System.out.println(guitarra.repararInstrumento());
        
        Flauta flauta= new Flauta("plástico");
        System.out.println(flauta.repararInstrumento());
                
                
                
    }
    
}
