package com.ramon12.android.geoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.ramon12.android.model.Pregunta;
public class GeoActivity extends AppCompatActivity {

    private Button mBottonCierto, mBottonFalso, mBotonSiguiente;
    private TextView mTextoPregunta;
    private Pregunta mBancoDePreguntas[] = {
            new Pregunta(R.string.texto_pregunta_1, false),
            new Pregunta(R.string.texto_pregunta_2, true),
            new Pregunta(R.string.texto_pregunta_3, true),
            new Pregunta(R.string.texto_pregunta_4, true),
            new Pregunta(R.string.texto_pregunta_5, false),
    };
    private int mPreguntaActual = 0;
    private void actualizarPregunta(){
        int preguntaActual = mBancoDePreguntas[mPreguntaActual].getmIdResTexto();
        mTextoPregunta.setText(preguntaActual);
    }
    private void verificarResta(boolean botonOprimido){
        boolean respuestasEsVerdadera = mBancoDePreguntas[mPreguntaActual].ismRespuesraVerdadera();
        if (botonOprimido == respuestasEsVerdadera) {
            Toast.makeText(GeoActivity.this, R.string.texto_correcto, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(GeoActivity.this, R.string.texto_incorrecto, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);

        mBottonCierto = (Button) findViewById(R.id.botton_cierto);
        mBottonFalso = (Button) findViewById(R.id.botton_falso);
        mBottonCierto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(GeoActivity.this, R.string.texto_correcto, Toast.LENGTH_SHORT).show();
                verificarResta(true);

            }
        });
        mBottonFalso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(GeoActivity.this, R.string.texto_incorrecto, Toast.LENGTH_SHORT).show();
                verificarResta(false);

            }
        });
        mTextoPregunta = (TextView) findViewById(R.id.texto_pregunta);
        mBotonSiguiente = (Button) findViewById(R.id.botton_siguiente);
        mBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPreguntaActual = mPreguntaActual + 1;
                if (mPreguntaActual == mBancoDePreguntas.length){
                    mPreguntaActual = 0;
                }
                actualizarPregunta();
            }
        });
    }


}
