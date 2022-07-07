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
public class Apartamento {
    
    private String cocina;
    private double areaConstruida;
    private int ubicacion;

    public Apartamento(String cocina, double areaConstruida, int ubicacion) {
        this.cocina = cocina;
        this.areaConstruida = areaConstruida;
        this.ubicacion = ubicacion;
    }

    public String getCocina() {
        return cocina;
    }

    public void setCocina(String cocina) {
        this.cocina = cocina;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Apartamento{" + "cocina=" + cocina + ", areaConstruida=" + areaConstruida + ", ubicacion=" + ubicacion + '}';
    }
    
    
    
}
