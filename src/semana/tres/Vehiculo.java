package semana.tres;

public abstract class Vehiculo {

    private String motor;
    private int ruedas;

    public Vehiculo() {

    }

    public void moverse() {
        System.out.println("Me estoy trasladando");
    }

    public abstract void frenar(String ruta);
    
    public static double obtenerContaminacion(){
        return 15.4;
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
