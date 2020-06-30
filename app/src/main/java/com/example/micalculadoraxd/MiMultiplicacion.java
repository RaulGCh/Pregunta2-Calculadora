package com.example.micalculadoraxd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MiMultiplicacion extends AppCompatActivity {
    TextView mensaje;
    int nro1, nro2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_multiplicacion);

        Bundle extras = getIntent().getExtras();
        nro1 = Integer.parseInt(extras.getString("nro1"));
        nro2 = Integer.parseInt(extras.getString("nro2"));
        mensaje = findViewById(R.id.txt_mensaje2);
        mensaje.setText("la multipliacion es: "+(nro1*nro2));
    }
}
