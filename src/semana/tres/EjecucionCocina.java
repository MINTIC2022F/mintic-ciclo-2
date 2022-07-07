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
public class EjecucionCocina {
    
    public static void main(String[] args) {
        CocinaColombiana col = new CocinaColombiana("Maiz pelao");
        CocinaColombiana col2=new CocinaColombiana("Maiz verde", "Arepa", "Tenedor", 
                "POstre de limón", 15000);
        
        CocinaItaliana coita=new CocinaItaliana("Doble crema");
        
        col.setCosto(10000);
        System.out.println(col2);
        
        col.prepararPasta();
        coita.prepararPasta();
        
        System.out.println(CocinaItaliana.obtenerNombreChef());
        System.out.println(CocinaItaliana.SALARIO);
        col.prepararArroz();
        coita.prepararArroz();
        System.out.println(coita.prepararSalsas("Picante"));
        
    }
    
}
