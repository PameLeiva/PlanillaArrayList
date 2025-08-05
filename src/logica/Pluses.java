
package logica;

/**
 *
 * @author pamel
 */
public class Pluses {
    private int idPlus;
    private String titulo;
    private float porcIncremento;

    public Pluses(int idPlus, String titulo, float porcIncremento) {
        this.idPlus = idPlus;
        this.titulo = titulo;
        this.porcIncremento = porcIncremento;
    }
    
     public Pluses() {
        this.idPlus = 0;
        this.titulo = "";
        this.porcIncremento = 0;
    }

    public int getIdPlus() {
        return idPlus;
    }

    public void setIdPlus(int idPlus) {
        this.idPlus = idPlus;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPorcIncremento() {
        return porcIncremento;
    }

    public void setPorcIncremento(float porcIncremento) {
        this.porcIncremento = porcIncremento;
    }
}
