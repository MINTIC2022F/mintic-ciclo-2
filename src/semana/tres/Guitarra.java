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
public class Guitarra implements Tienda{

    private String tipoCuerda;

    public Guitarra(String tipoCuerda) {
        this.tipoCuerda = tipoCuerda;
    }
    
    public String afinarse(){
        return "Guitarra afinada";
    }

    public String getTipoCuerda() {
        return tipoCuerda;
    }

    public void setTipoCuerda(String tipoCuerda) {
        this.tipoCuerda = tipoCuerda;
    }
    
    
    @Override
    public void venderInstrumento() {
        System.out.println("Vendiendo Guitarra a 1000000");
    }

    @Override
    public boolean repararInstrumento() {
        return true;
    }

    @Override
    public String dictarClases() {
        return "Dictando clase de guitarra por don Ramón";

    }

    @Override
    public String toString() {
        return "Guitarra{" + "tipoCuerda=" + tipoCuerda + '}';
    }
    
    
    
}
