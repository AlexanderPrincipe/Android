package com.example.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private RadioButton rb1;
    private RadioButton rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 = (EditText) findViewById(R.id.txtnum1);
        et2 = (EditText) findViewById(R.id.txtnum2);
        tv1 = (TextView) findViewById(R.id.txtResultado);
        rb1 = (RadioButton) findViewById(R.id.rbsumar);
        rb2 = (RadioButton) findViewById(R.id.rbrestar);
    }

    public void Calcular(View view) {
        int et1_int = Integer.parseInt(et1.getText().toString());
        int et2_int = Integer.parseInt(et2.getText().toString());

        if (rb1.isChecked()) {
            int suma = et1_int + et2_int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        }else if (rb2.isChecked()) {
            int resta = et1_int - et2_int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }
    }


}
