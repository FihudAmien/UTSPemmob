package com.example.mrhead;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView rambut, alis, mata, janggut;
    CheckBox cbrambut, cbalis, cbmata, cbjanggut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rambut = findViewById(R.id.rambut);
        alis = findViewById(R.id.alis);
        mata = findViewById(R.id.mata);
        janggut = findViewById(R.id.janggut);

        cbrambut = findViewById(R.id.cbrambut);
        cbalis = findViewById(R.id.cbalis);
        cbmata = findViewById(R.id.cbmata);
        cbjanggut = findViewById(R.id.cbjanggut);

        cbrambut.setOnClickListener(this);
        cbalis.setOnClickListener(this);
        cbmata.setOnClickListener(this);
        cbjanggut.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == cbrambut.getId()){
            if(rambut.getVisibility() == View.VISIBLE){
                rambut.setVisibility(View.INVISIBLE);
            } else {
                rambut.setVisibility(View.VISIBLE);
            }
        }
        if (v.getId() == cbalis.getId()){
            if(alis.getVisibility() == View.VISIBLE){
                alis.setVisibility(View.INVISIBLE);
            } else {
                alis.setVisibility(View.VISIBLE);
            }
        }
        if (v.getId() == cbmata.getId()){
            if(mata.getVisibility() == View.VISIBLE){
                mata.setVisibility(View.INVISIBLE);
            } else {
                mata.setVisibility(View.VISIBLE);
            }
        }
        if (v.getId() == cbjanggut.getId()){
            if(janggut.getVisibility() == View.VISIBLE){
                janggut.setVisibility(View.INVISIBLE);
            } else {
                janggut.setVisibility(View.VISIBLE);
            }
        }
    }
}
