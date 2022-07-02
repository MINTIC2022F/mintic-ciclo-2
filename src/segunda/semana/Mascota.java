package segunda.semana;

public class Mascota {

    private String raza;
    private String color;
    private String sexo;
    private double tamano;

    public Mascota() {
    }

    public Mascota(String raza, String color, String sexo, double tamano) {
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.tamano = tamano;

    }

    public Mascota(String sexo, double tamano) {
        this.color = "azul";
        this.sexo = sexo;
        this.tamano = tamano;
    }

    public void comer(String comida) {
        System.out.println("Estoy comiendo " + comida);
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getTamano() {
        return this.tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
