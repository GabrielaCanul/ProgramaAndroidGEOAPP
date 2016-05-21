package com.ramon12.android.geoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GeoActivity extends AppCompatActivity {

    private Button mBottonCierto, mBottonFalso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);

        mBottonCierto = (Button) findViewById(R.id.botton_cierto);
        mBottonFalso = (Button) findViewById(R.id.botton_falso);
        mBottonCierto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GeoActivity.this, R.string.texto_correcto, Toast.LENGTH_SHORT).show();

            }
        });
        mBottonFalso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GeoActivity.this, R.string.texto_incorrecto, Toast.LENGTH_SHORT).show();

            }
        });

    }
}
