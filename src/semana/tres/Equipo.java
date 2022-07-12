/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.tres;

import java.util.ArrayList;

/**
 *
 * @author cdani
 */
public class Equipo {
    private String nombre;
    private ArrayList<Futbolista> futbolistas;

    public Equipo(String nombre, ArrayList<Futbolista> futbolistas) {
        this.nombre = nombre;
        this.futbolistas = new ArrayList<>();
        this.futbolistas = futbolistas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Futbolista> getFutbolistas() {
        return futbolistas;
    }

    public void setFutbolistas(ArrayList<Futbolista> futbolistas) {
        this.futbolistas = futbolistas;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", futbolistas=" + futbolistas + '}';
    }

    public void agregarFutbolista(Futbolista futbolista){
        this.futbolistas.add(futbolista);
    }
    
    public void suspenderFutbolista(Futbolista futbolista){
        this.futbolistas.remove(futbolista);
    }
    
    public ArrayList<Futbolista> consultarFutbolistasLesionados(){
    
        ArrayList<Futbolista> respuestaFutbolista=new ArrayList<>();
        for(Futbolista f: this.futbolistas){
            if(f.isEstaLesionado()){
                respuestaFutbolista.add(f);
            }
        }
        return respuestaFutbolista;
    }
    
    public void actualizarFutbolista(Futbolista futbolistaActualizado){
        for(Futbolista f:this.futbolistas){
            if(f.getNombre().equals(futbolistaActualizado.getNombre())){
                int indice=this.futbolistas.indexOf(f);
                this.futbolistas.set(indice, futbolistaActualizado);
            };
        }
    }
    
}
