package com.example.mozeeb.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class persegi_panjang extends AppCompatActivity {
    //
    EditText p,l;
    Button hitung;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi_panjang);
        //
        p =(EditText)findViewById(R.id.panjang);
        l =(EditText)findViewById(R.id.lebar);
        hitung =(Button)findViewById(R.id.hitung);
        hasil =(TextView)findViewById(R.id.hasil);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p.length()==0 && l.length()==0){
                    Toast.makeText(getApplication(), "Panjang dan Lebar tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if (p.length()==0){
                    Toast.makeText(getApplication(), "Panjang tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if (l.length()==0){
                    Toast.makeText(getApplication(), " Lebar tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else{
                    //
                    String isiPanjang = p.getText().toString();
                    String isiTinggi = l.getText().toString();
                    int p = Integer.parseInt(isiPanjang);
                    int l = Integer.parseInt(isiTinggi);
                    int hs = kotak(p,l);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });

    }
    public int kotak(int p, int l){
        return p * l;
    }
}