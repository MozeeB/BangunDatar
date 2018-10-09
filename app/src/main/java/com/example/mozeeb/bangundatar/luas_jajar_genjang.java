package com.example.mozeeb.bangundatar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class luas_jajar_genjang extends AppCompatActivity {
    //
    EditText a,t;
    Button hitung;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.luas_jajar_genjang);
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
                    int a = Integer.parseInt(isiAlas);
                    int t = Integer.parseInt(isiTinggi);
                    int bs = jajar(a,t);
                    String output = String.valueOf(bs);
                    hasil.setText(output.toString());
                }
            }
        });

    }
    public int jajar(int a, int t){
        return a * t;
    }
}
