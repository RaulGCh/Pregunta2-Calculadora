package com.example.micalculadoraxd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MiResultado extends AppCompatActivity {
    TextView mensaje;
    int nro1, nro2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_resultado);

        Bundle extras = getIntent().getExtras();
        nro1 = Integer.parseInt(extras.getString("nro1"));
        nro2 = Integer.parseInt(extras.getString("nro2"));
        mensaje = findViewById(R.id.txt_mensaje);
        mensaje.setText("la suma es: "+(nro1+nro2));
    }
}
