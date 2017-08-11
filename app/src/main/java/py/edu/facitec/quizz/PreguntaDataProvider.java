package py.edu.facitec.quizz;

import java.util.ArrayList;
import java.util.List;


public class PreguntaDataProvider {

    public static Pregunta getPergunta(){
        Pregunta p = new Pregunta();
                p.setTexto("Cuál es el color del Sol?");
                p.setId(0);
        List<Opciones> opciones = new ArrayList<>();
        opciones.add(new Opciones(0,"Azul",false));
        opciones.add(new Opciones(0,"Rojo",false));
        opciones.add(new Opciones(0,"Amarillo",true));
                p.setOpciones(opciones);
        return p;
    }

    public static List<Pregunta> getPreguntas(){
        List<Pregunta> preguntas = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Pregunta p = new Pregunta();
            p.setTexto("Cuál es el color del Sol?");
            p.setId(0);
            List<Opciones> opciones = new ArrayList<>();
            opciones.add(new Opciones(0,"Azul",false));
            opciones.add(new Opciones(0,"Rojo",false));
            opciones.add(new Opciones(0,"Amarillo",true));
            p.setOpciones(opciones);
            preguntas.add(p);

            Pregunta p2 = new Pregunta();
            p2.setTexto("Cuál es la temperatura asociada al color rojo?");
            p2.setId(0);
            List<Opciones> opciones2 = new ArrayList<>();
            opciones2.add(new Opciones(0,"4500 C",true));
            opciones2.add(new Opciones(0,"5500 C",false));
            opciones2.add(new Opciones(0,"6500 C",false));
            p2.setOpciones(opciones2);
            preguntas.add(p2);
        }
        return preguntas;
    }

}
