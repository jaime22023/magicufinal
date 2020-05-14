package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

            private ImageView ball1;
            private TextView respuesta;

            private String[] respuestaArray={"Concentrate y pregunta de nuevo", "Definitivamente es asì", "Es cierto", "Las señales apuntan a que sì", "Lo mas probable", "Mejor no decirte ahora",
                    "Mi respuesta es no", "Mis fuentes dicen que no", "Muy dudoso", "No cuentes con eso", "No puedo predecir ahora", "Outlook no es tan bueno",
                    "Perspectiva buena", "Pregunte de nuevo mas tarde", "Puede confiar en èl", "Respuesta confusa, intente de nuevo",
                    "Si definitivamente", "Sin duda", "Sì", "como yo lo veo, sì"};

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                ball1=findViewById(R.id.boton);

                respuesta=findViewById(R.id.respuesta);

                ball1.setOnClickListener((View.OnClickListener) this);
                Toast.makeText(MainActivity.this, "Buscando Tu Destino!!!", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onClick (View V)  {

                switch (V.getId()) {
                    case R.id.boton:
                        int random = new Random().nextInt(respuestaArray.length);
                        respuesta.setText(respuestaArray[random]);

                        break;
                }
            }

}
