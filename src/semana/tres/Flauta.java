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
public class Flauta implements Tienda{
    
    private String material;

    public Flauta(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    

    @Override
    public void venderInstrumento() {
        System.out.println("Vendiendo la flauta nueva");
    }

    @Override
    public boolean repararInstrumento() {
        return false;
    }

    @Override
    public String dictarClases() {
        return "la flauta es intransferible, traer boquilla";
    }

    @Override
    public String toString() {
        return "Flauta{" + "material=" + material + '}';
    }
    
    
}
