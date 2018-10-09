package com.example.mozeeb.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class luas_segitiga extends AppCompatActivity {
    //
    EditText a,t;
    Button hitung;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.luas_segitiga);
        //
        a =(EditText)findViewById(R.id.alas);
        t =(EditText)findViewById(R.id.tinggi);
        hitung =(Button)findViewById(R.id.hitung);
        hasil =(TextView)findViewById(R.id.hasil);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a.length()==0 && t.length()==0){
                    Toast.makeText(getApplication(), "Alas dan Tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if (a.length()==0){
                    Toast.makeText(getApplication(), "Alas tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if (t.length()==0){
                    Toast.makeText(getApplication(), " Tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else{
                    //
                    String isiAlas = a.getText().toString();
                    String isiTinggi = t.getText().toString();
                    double a = Double.parseDouble(isiAlas);
                    double t = Double.parseDouble(isiTinggi);
                    double hs = segitiga(a,t);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });

    }
    public double segitiga(double a, double t){
        return a * t / 2;
    }
}