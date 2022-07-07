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
public class CocinaItaliana extends Cocina {

    private String tipoQueso;
    final static int SALARIO = 100;

    public CocinaItaliana(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public String prepararSalsas() {
        return "Preparando la salsa...";

    }

    public String prepararSalsas(String ingredientes) {
        return "Preparando la salsa con "+ingredientes;

    }

    public static String obtenerNombreChef() {
        return "Mario";
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    @Override
    public void prepararPasta() {
        System.out.println("Prepatando pasta ITALIANA...");
    }

}
