package com.example.calculadora4funcionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    Button suma;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.editnumero1);
        resultado = (TextView)findViewById(R.id.textoresultado);
        suma = (Button)findViewById(R.id.botonsumar);

        //Funcion CLICK

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(num1.getText().toString());
                double sumatoria = numero1 + 10;
                resultado.setText(Double.toString(sumatoria));
            }
        });
    }
}