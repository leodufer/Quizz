package py.edu.facitec.quizz;

import java.util.List;

/**
 * Created by virux on 26/07/17.
 */

public class Pregunta {

    private int id;
    private String texto;
    private List<Opciones> opciones;

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

    public List<Opciones> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<Opciones> opciones) {
        this.opciones = opciones;
    }
}
