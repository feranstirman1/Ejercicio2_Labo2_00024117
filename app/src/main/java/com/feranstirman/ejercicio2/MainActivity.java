package com.feranstirman.ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView foto1,foto2,foto3,foto4,foto5,foto6,foto7,foto8,foto9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foto1 = findViewById(R.id.foto1);
        foto2 = findViewById(R.id.foto2);
        foto3 = findViewById(R.id.foto3);
        foto4 = findViewById(R.id.foto4);
        foto5 = findViewById(R.id.foto5);
        foto6 = findViewById(R.id.foto6);
        foto7 = findViewById(R.id.foto7);
        foto8 = findViewById(R.id.foto8);
        foto9 = findViewById(R.id.foto9);

        foto1.setOnClickListener(this);
        foto2.setOnClickListener(this);
        foto3.setOnClickListener(this);
        foto4.setOnClickListener(this);
        foto5.setOnClickListener(this);
        foto6.setOnClickListener(this);
        foto7.setOnClickListener(this);
        foto8.setOnClickListener(this);
        foto9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int[] dibujos = {R.drawable.fotoa,R.drawable.fotob,R.drawable.fotoc};
        switch (v.getId()){
            case R.id.foto1:
                foto1.setImageResource(dibujos[(int)Math.floor(Math.random()*3)]);
                break;
            case R.id.foto2:
                foto2.setImageResource(dibujos[(int)Math.floor(Math.random()*3)]);
                break;
            case R.id.foto3:
                foto3.setImageResource(dibujos[(int)Math.floor(Math.random()*3)]);
                break;
            case R.id.foto4:
                foto4.setImageResource(dibujos[(int)Math.floor(Math.random()*3)]);
                break;
            case R.id.foto5:
                foto5.setImageResource(dibujos[(int)Math.floor(Math.random()*3)]);
                break;
            case R.id.foto6:
                foto6.setImageResource(dibujos[(int)Math.floor(Math.random()*3)]);
                break;
            case R.id.foto7:
                foto7.setImageResource(dibujos[(int)Math.floor(Math.random()*3)]);
                break;
            case R.id.foto8:
                foto8.setImageResource(dibujos[(int)Math.floor(Math.random()*3)]);
                break;
            case R.id.foto9:
                foto9.setImageResource(dibujos[(int)Math.floor(Math.random()*3)]);
                break;
        }

    }
}
