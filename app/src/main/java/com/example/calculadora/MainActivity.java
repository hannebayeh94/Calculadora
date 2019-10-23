package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button sumar, restar, multiplicar, division;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      num1 = findViewById(R.id.n1);
      num2 = findViewById(R.id.n2);
      sumar = findViewById(R.id.sumar);
      restar = findViewById(R.id.restar);
      multiplicar =  findViewById(R.id.multiplicar);
      division = findViewById(R.id.division);
      resultado = findViewById(R.id.resultado);


      sumar.setOnClickListener(this);
      restar.setOnClickListener(this);
      multiplicar.setOnClickListener(this);
      division.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int entero1 =Integer.parseInt(n1);
        int entero2 =Integer.parseInt(n2);

        int rpt = 0;

        switch (v.getId()){


            case R.id.sumar:
                rpt = entero1+entero2;
                break;

            case R.id.restar:
                rpt = entero1-entero2;
                break;

            case R.id.multiplicar:
                rpt = entero1*entero2;
                break;

            case R.id.division:
                rpt = entero1/entero2;
                break;
        }

        resultado.setText(""+rpt);

    }
}
