package semana.seis;

public class Concesionario {
    
    private int identificacion;
    private String ubicacion;

    public Concesionario(int identificacion, String ubicacion) {
        this.identificacion = identificacion;
        this.ubicacion = ubicacion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Concesionario{" + "identificacion=" + identificacion + ", ubicacion=" + ubicacion + '}';
    }
    
}
