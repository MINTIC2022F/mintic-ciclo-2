package semana.tres;

public class Motocicleta extends Vehiculo{

    private String tipoMotor;

    public Motocicleta() {

    }

    public String getTipoMotor() {
        return this.tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor=tipoMotor;
    }

    @Override
    public String toString() {
        return "Motocicleta: {" + "motor=" + this.tipoMotor + '}';
    }

    @Override
    public void frenar(String ruta) {
        System.out.println("Frenando con la moto");
    }
    
}
