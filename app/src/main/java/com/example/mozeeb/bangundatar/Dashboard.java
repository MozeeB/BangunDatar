package com.example.mozeeb.bangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
    public void btn_psg(View view){
        Intent psg = new Intent(Dashboard.this, persegi_panjang.class);
        startActivity(psg);
    }

    public void btn_sgt(View view){
        Intent sgt = new Intent(Dashboard.this, luas_segitiga.class);
        startActivity(sgt);
    }
    public  void btn_jajar(View view){
        Intent jajar = new Intent(Dashboard.this, luas_jajar_genjang.class);
        startActivity(jajar);
    }
    public void btn_persegi(View view){
        Intent per = new Intent(Dashboard.this, luas_persegi.class);
        startActivity(per);
    }
    public void btn_keliling(View view){
        Intent kel = new Intent(Dashboard.this, keliling_persegi.class);
        startActivity(kel);
    }
}
