package com.example.mozeeb.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class keliling_persegi extends AppCompatActivity {
    //
    EditText s;
    Button hitung;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keliling_persegi);
        //
        s =(EditText)findViewById(R.id.sisi);
        hitung =(Button)findViewById(R.id.hitung);
        hasil =(TextView)findViewById(R.id.hasil);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s.length()==0){
                    Toast.makeText(getApplication(), "Sisi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else{
                    //
                    String isiSisi = s.getText().toString();
                    int s = Integer.parseInt(isiSisi);
                    int hs = keliling(s);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });

    }
    public int keliling(int s){
        return 4 * s;
    }
}
