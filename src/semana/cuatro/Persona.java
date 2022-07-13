package semana.cuatro;


public class Persona {
    
    private int documento;
    private String nombre;

    public Persona(int documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "documento=" + documento + ", nombre=" + nombre + '}';
    }
    
    
    
}
