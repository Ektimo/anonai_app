package com.example.anonai;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class Processing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_processing);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = getIntent();
                String contentString = intent.getStringExtra("videoURI");
                Intent intent2 = new Intent(Processing.this, VideoPlay.class);
                intent2.putExtra("videoURI", contentString);
                startActivity(intent2);
            }
        }, 3000);


    }
}
