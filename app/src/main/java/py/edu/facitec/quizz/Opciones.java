package py.edu.facitec.quizz;

/**
 * Created by virux on 26/07/17.
 */

public class Opciones {
    private int id;
    private String texto;
    private boolean correcto;

    public Opciones(int id, String texto, boolean correcto) {
        this.id = id;
        this.texto = texto;
        this.correcto = correcto;
    }

    public Opciones() {
        this.id = 0;
        this.texto = "";
        this.correcto = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isCorrecto() {
        return correcto;
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }
}
