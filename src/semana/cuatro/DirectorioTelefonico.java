package semana.cuatro;

public class DirectorioTelefonico {

    private int telefono;
    private String nombre;

    public DirectorioTelefonico(int telefono, String nombre) {
        this.telefono = telefono;
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "DirectorioTelefonico{" + "telefono=" + telefono + ", nombre=" + nombre + '}';
    }

}
