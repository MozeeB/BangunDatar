package com.example.mozeeb.bangundatar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class luas_persegi extends AppCompatActivity {
    //
    EditText s1,s2;
    Button hitung;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.luas_persegi);
        //
        s1 =(EditText)findViewById(R.id.sisi1);
        s2 =(EditText)findViewById(R.id.sisi2);
        hitung =(Button)findViewById(R.id.hitung);
        hasil =(TextView)findViewById(R.id.hasil);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s1.length()==0 && s2.length()==0){
                    Toast.makeText(getApplication(), "Alas dan Tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if (s1.length()==0){
                    Toast.makeText(getApplication(), "Alas tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if (s2.length()==0){
                    Toast.makeText(getApplication(), " Tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else{
                    //
                    String isiSisi1 = s1.getText().toString();
                    String isiSisi2 = s2.getText().toString();
                    int s1 = Integer.parseInt(isiSisi1);
                    int s2 = Integer.parseInt(isiSisi2);
                    int bs = luas(s1,s2);
                    String output = String.valueOf(bs);
                    hasil.setText(output.toString());
                }
            }
        });

    }
    public int luas(int s1, int s2){
        return s1 * s2;
    }
}

