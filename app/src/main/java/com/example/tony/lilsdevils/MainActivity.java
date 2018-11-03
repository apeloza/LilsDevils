package com.example.tony.lilsdevils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void summonDevil(View view){
        int id = getResources().getIdentifier("vampire", "drawable", getPackageName());
        ImageView devilImage = findViewById(R.id.DevilImage);
        devilImage.setImageResource(id);
    }
}
