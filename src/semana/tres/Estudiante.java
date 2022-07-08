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
public class Estudiante {
    
    private String documento;
    private String nombre;
    private int edad;

    public Estudiante(String documento, String nombre, int edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "documento=" + documento + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
}
