package com.example.micalculadoraxd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultResta extends AppCompatActivity {
    TextView mensaje;
    int nro1, nro2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_resta);
        Bundle extras = getIntent().getExtras();
        nro1 = Integer.parseInt(extras.getString("nro1"));
        nro2 = Integer.parseInt(extras.getString("nro2"));
        mensaje = findViewById(R.id.txt_mensaje1);
        mensaje.setText("la resta es: "+(nro1-nro2));
    }
}
