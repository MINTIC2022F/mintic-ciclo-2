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
public class Futbolista {
    private int numero;
    private String nombre;
    private boolean estaLesionado;

    public Futbolista(int numero, String nombre, boolean estaLesionado) {
        this.numero = numero;
        this.nombre = nombre;
        this.estaLesionado = estaLesionado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstaLesionado() {
        return estaLesionado;
    }

    public void setEstaLesionado(boolean estaLesionado) {
        this.estaLesionado = estaLesionado;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "numero=" + numero + ", nombre=" + nombre + ", estaLesionado=" + estaLesionado + '}';
    }

    
  
    
    
}
