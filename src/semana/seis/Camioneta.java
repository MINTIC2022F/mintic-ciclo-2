package semana.seis;

public class Camioneta {
    private int id;
    private String placa;
    private int cilindraje;
    private String referencia;
    private String pais;
    private String cidadPlaca;
    private int concesionarioIdenticacion;

    public Camioneta(String placa, int cilindraje, String referencia, String pais, String cidadPlaca, int concesionarioIdenticacion) {
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.referencia = referencia;
        this.pais = pais;
        this.cidadPlaca = cidadPlaca;
        this.concesionarioIdenticacion = concesionarioIdenticacion;
    }

    public Camioneta(int id, String placa, int cilindraje, int concesionarioIdenticacion) {
        this.id = id;
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.concesionarioIdenticacion = concesionarioIdenticacion;
    }

    public Camioneta(int id, String placa, int cilindraje) {
        this.id = id;
        this.placa = placa;
        this.cilindraje = cilindraje;
    }

    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCidadPlaca() {
        return cidadPlaca;
    }

    public void setCidadPlaca(String cidadPlaca) {
        this.cidadPlaca = cidadPlaca;
    }

    public int getConcesionarioIdenticacion() {
        return concesionarioIdenticacion;
    }

    public void setConcesionarioIdenticacion(int concesionarioIdenticacion) {
        this.concesionarioIdenticacion = concesionarioIdenticacion;
    }

    @Override
    public String toString() {
        return "Camioneta{" + "id=" + id + ", placa=" + placa + ", cilindraje=" + cilindraje + ", concesionarioIdenticacion=" + concesionarioIdenticacion + '}';
    }
    
    
}
