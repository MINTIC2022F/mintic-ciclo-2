package segunda.semana;

public class Vehiculo {

    private String motor;
    private int ruedas;

    public Vehiculo() {

    }

    public void moverse() {
        System.out.println("Me estoy trasladando");
    }

    public void frenar(String ruta) {
        System.out.println("Estoy frenando en " + ruta);
    }

    public String getMotor() {
        return this.motor;
    }

    public void setMotor(String motor) {
        this.motor=motor;
    }
    
    public int getRuedas() {
        return this.ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas=ruedas;
    }
}
