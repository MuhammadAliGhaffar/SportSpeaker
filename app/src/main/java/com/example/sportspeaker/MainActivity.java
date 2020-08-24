package com.example.sportspeaker;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton imgboxing,imgkickboxing,imgjudo,imgkarate,imgaikido,imgtaekwondo;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgboxing=findViewById(R.id.imgboxing);
        imgkickboxing=findViewById(R.id.imgkickboxing);
        imgjudo=findViewById(R.id.imgjudo);
        imgkarate=findViewById(R.id.imgkarate);
        imgaikido=findViewById(R.id.imgaikido);
        imgtaekwondo=findViewById(R.id.imgtaekwondo);

        imgboxing.setOnClickListener(this);
        imgkickboxing.setOnClickListener(this);
        imgjudo.setOnClickListener(this);
        imgkarate.setOnClickListener(this);
        imgaikido.setOnClickListener(this);
        imgtaekwondo.setOnClickListener(this);
    }

    @Override
    public void onClick(View ImageButton) {

        switch (ImageButton.getId()){
            case R.id.imgboxing:
                mp = MediaPlayer.create(this, R.raw.boxing);
                mp.start();
                Log.i("TAG","Boxing is Tapped");
                break;

            case R.id.imgkickboxing:
                mp = MediaPlayer.create(this, R.raw.kickboxing);
                mp.start();
                Log.i("TAG","KickBoxing is Tapped");
                break;

            case R.id.imgjudo:
                mp = MediaPlayer.create(this, R.raw.judo);
                mp.start();
                Log.i("TAG","Judo is Tapped");
                break;

            case R.id.imgkarate:
                mp = MediaPlayer.create(this, R.raw.karate);
                mp.start();
                Log.i("TAG","Karate is Tapped");
                break;

            case R.id.imgaikido:
                mp = MediaPlayer.create(this, R.raw.aikido);
                mp.start();
                Log.i("TAG","Kido is Tapped");
                break;

            case R.id.imgtaekwondo:
                mp = MediaPlayer.create(this, R.raw.taekwondo);
                mp.start();
                Log.i("TAG","Taekwondo is Tapped");
                break;


        }

    }
}