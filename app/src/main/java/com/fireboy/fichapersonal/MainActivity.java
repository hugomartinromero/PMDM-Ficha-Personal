package com.fireboy.fichapersonal;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnNombre, btnCurso, btnLenguajes, btnNuevoRegistro;
    TextView lblNombre, lblCurso, lblLenguajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();


    }

    private void initComponents() {
        btnNombre = findViewById(R.id.btnNombre);
        btnCurso = findViewById(R.id.btnCurso);
        btnLenguajes = findViewById(R.id.btnLenguajes);
        btnNuevoRegistro = findViewById(R.id.btnNuevoRegistro);

        lblNombre = findViewById(R.id.lblNombre);
        lblCurso = findViewById(R.id.lblCurso);
        lblLenguajes = findViewById(R.id.lblLenguajes);
    }
}