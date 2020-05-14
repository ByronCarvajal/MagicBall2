package com.example.magicball2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView ball;
    private TextView respuesta;
    private String [] arrayRespuesta = {"Es cierto", "Definitivamente es así", "Sin duda", "Sí definitivamente", "Puede confiar en él", "Como yo lo veo, sí",
            "Lo más probable", "Perspectiva buena", "Sí", "Las señales apuntan a sí", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde",
            "Mejor no decirte ahora", "No puedo predecir ahora", "Concéntrate y pregunta de nuevo", "No cuentes con eso",
            "Mi respuesta es no", "Mis fuentes dicen que no", "Muy dudoso"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ball = findViewById(R.id.boton);

        respuesta = findViewById(R.id.respuesta);

        ball.setOnClickListener((View.OnClickListener)this);

        Toast.makeText(MainActivity.this, "El destino esta contigo?", Toast.LENGTH_LONG  ).show ();
    }

    @Override
    public void onClick (View v){

        switch (v.getId()){

            case R.id.boton:
                int rand = new Random().nextInt(arrayRespuesta.length);
                        respuesta.setText(arrayRespuesta[rand]);
                break;
        }
    }
}
