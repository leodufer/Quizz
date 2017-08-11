package py.edu.facitec.quizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButtonA;
    RadioButton radioButtonB;
    RadioButton radioButtonC;
    TextView textViewPregunta;
    RadioGroup radioGroup;
    Button buttonConfirmar;
    Pregunta pregunta;
    List<Pregunta> preguntas;
    int position = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioButtonA = (RadioButton)findViewById(R.id.radioButtonA);
        radioButtonB = (RadioButton)findViewById(R.id.radioButtonB);
        radioButtonC = (RadioButton)findViewById(R.id.radioButtonC);
        textViewPregunta = (TextView) findViewById(R.id.textViewPregunta);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        buttonConfirmar = (Button)findViewById(R.id.buttonConfirmar);

    }


    @Override
    protected void onStart() {
        super.onStart();
        preguntas = PreguntaDataProvider.getPreguntas();
        score=0;
        nextPregunta();
    }
    public void confirmar(View v){
        if(!radioButtonA.isChecked()&&!radioButtonB.isChecked()&&!radioButtonC.isChecked()){
            Toast.makeText(this,"Seleccione una respuesta",Toast.LENGTH_SHORT).show();
        }else{
            if(radioButtonA.isChecked() && pregunta.getOpciones().get(0).isCorrecto()){
                score++;
            }else if(radioButtonB.isChecked() && pregunta.getOpciones().get(1).isCorrecto()){
                score++;
            }else if(radioButtonC.isChecked() && pregunta.getOpciones().get(2).isCorrecto()){
                score++;
            }
            else{
                //Toast.makeText(this,"No es correcta :-(",Toast.LENGTH_SHORT).show();
            }
            nextPregunta();
        }


    }

    public void nextPregunta(){
        if(position >= preguntas.size()){
            textViewPregunta.setText("Finish. You score is "+score);
            radioGroup.setVisibility(View.INVISIBLE);
            buttonConfirmar.setEnabled(false);
            return;
        }else{
            pregunta = preguntas.get(position);
        }
        textViewPregunta.setText(pregunta.getTexto());
        radioButtonA.setText(pregunta.getOpciones().get(0).getTexto());
        radioButtonB.setText(pregunta.getOpciones().get(1).getTexto());
        radioButtonC.setText(pregunta.getOpciones().get(2).getTexto());
        radioGroup.clearCheck();
        position++;
    }

}
