package logica;

/**
 *
 * @author pamel
 */
public class Puestos {

    private int idPuesto;
    private String nombrePuesto;
    private double salario;

    public Puestos(int idPuesto, String nombrePuesto, double salario) {
        this.idPuesto = idPuesto;
        this.nombrePuesto = nombrePuesto;
        this.salario = salario;
    }

    public Puestos() {
        this.idPuesto = 0;
        this.nombrePuesto = "";
        this.salario = 0;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
