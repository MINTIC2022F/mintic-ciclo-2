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
public class CocinaColombiana extends Cocina{
    
    private String tipoMaiz;

    public CocinaColombiana(String tipoMaiz) {
        this.tipoMaiz = tipoMaiz;
    }
    
    public String prepararRellenoArepa(){
        return "el relleno se preparó...";
                
    }
    
    public boolean rellenarArepa(){
        return true;
    }

    @Override
    public void prepararPasta() {
        System.out.println("Preparando la pasta desde Colombia");
    }

    public String getTipoMaiz() {
        return tipoMaiz;
    }

    public void setTipoMaiz(String tipoMaiz) {
        this.tipoMaiz = tipoMaiz;
    }
    
    
   
}
