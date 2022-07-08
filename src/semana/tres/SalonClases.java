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
public class SalonClases {
    private int cantidadPupitres;
    private String tablero;
    private Estudiante[] estudiantes;

    public SalonClases(int cantidadPupitres, String tablero) {
        this.cantidadPupitres = cantidadPupitres;
        this.tablero = tablero;
    }

    public SalonClases(int cantidadPupitres, String tablero, Estudiante[] estudiantes) {
        this.cantidadPupitres = cantidadPupitres;
        this.tablero = tablero;
        this.estudiantes = estudiantes;
    }

    public int getCantidadPupitres() {
        return cantidadPupitres;
    }

    public void setCantidadPupitres(int cantidadPupitres) {
        this.cantidadPupitres = cantidadPupitres;
    }

    public String getTablero() {
        return tablero;
    }

    public void setTablero(String tablero) {
        this.tablero = tablero;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "SalonClases{" + "cantidadPupitres=" + cantidadPupitres + ", tablero=" + tablero + ", estudiantes=" + estudiantes + '}';
    }
    
}
