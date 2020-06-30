package com.example.micalculadoraxd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button sumar,restar,multiplicar,dividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.txt_numero1);
        num2 = findViewById(R.id.txt_numero2);

        sumar = findViewById(R.id.btn_suma);
        restar = findViewById(R.id.btn_resta);
        multiplicar = findViewById(R.id.btn_multi);
        dividir = findViewById(R.id.btn_dividir);

    }

    public void sumar(View view) {
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nro1 = num1.getText().toString();
                String nro2 = num2.getText().toString();

                Intent intent = new Intent(MainActivity.this, MiResultado.class);
                intent.putExtra("nro1",nro1);
                intent.putExtra("nro2",nro2);
                startActivity(intent);
            }
        });
    }

    public void restar(View view) {
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nro1 = num1.getText().toString();
                String nro2 = num2.getText().toString();

                Intent intent = new Intent(MainActivity.this, ResultResta.class);
                intent.putExtra("nro1",nro1);
                intent.putExtra("nro2",nro2);
                startActivity(intent);
            }
        });
    }

    public void multiplicar(View view) {
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nro1 = num1.getText().toString();
                String nro2 = num2.getText().toString();

                Intent intent = new Intent(MainActivity.this, MiMultiplicacion.class);
                intent.putExtra("nro1",nro1);
                intent.putExtra("nro2",nro2);
                startActivity(intent);
            }
        });
    }

    public void dividir(View view) {
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nro1 = num1.getText().toString();
                String nro2 = num2.getText().toString();

                Intent intent = new Intent(MainActivity.this, MiDivicion.class);
                intent.putExtra("nro1",nro1);
                intent.putExtra("nro2",nro2);
                startActivity(intent);
            }
        });
    }
}
