package py.edu.facitec.quizz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {

    EditText emailEditText;
    EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailEditText = (EditText) findViewById(R.id.editTextEmail);
        passwordEditText = (EditText) findViewById(R.id.editTextPassword);

    }

    public void acceder(View view){
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();


        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            emailEditText.setError("Complete el email");
            return;
        }

        if(password.isEmpty()){
            passwordEditText.setError("Complete el password");
            return;
        }
        //TODO login
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        finish();


    }

    public void registrar(View view){

    }


}
