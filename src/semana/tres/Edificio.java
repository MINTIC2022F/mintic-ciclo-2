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
public class Edificio {
    
    private String zona;
    private String tipoEdicio;
    private Apartamento[] apartamentos;

    public Edificio(String zona, String tipoEdicio, Apartamento[] apartamentos) {
        this.zona = zona;
        this.tipoEdicio = tipoEdicio;
        this.apartamentos = apartamentos;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getTipoEdicio() {
        return tipoEdicio;
    }

    public void setTipoEdicio(String tipoEdicio) {
        this.tipoEdicio = tipoEdicio;
    }

    public Apartamento[] getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(Apartamento[] apartamentos) {
        this.apartamentos = apartamentos;
    }

    @Override
    public String toString() {
        return "Edificio{" + "zona=" + zona + ", tipoEdicio=" + tipoEdicio + ", apartamentos=" + apartamentos[0] + '}';
    }
    
    
    
    
}
