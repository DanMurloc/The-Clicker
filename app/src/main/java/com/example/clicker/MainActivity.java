package com.example.clicker;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    Long counterClic = 0L;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hideSystemUI();
    }
    private void hideSystemUI() {
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }
    public void onClick(View view){
        ImageView clicAltushka = (ImageView) view;
        counterClic++;
        TextView TextClick = findViewById(R.id.counterClick);
        String cli = counterClic.toString();
        TextClick.setText(cli);
        if(counterClic==100L){
            clicAltushka.setImageResource(R.drawable.altuha2);
        } else if (counterClic==200L) {
            clicAltushka.setImageResource(R.drawable.altuha3);
        }
        else if (counterClic==500L) {
            clicAltushka.setImageResource(R.drawable.altuha4);
        }
        else if (counterClic==1000) {
            clicAltushka.setImageResource(R.drawable.altuha5);
        }
        else if (counterClic==2000) {
            clicAltushka.setImageResource(R.drawable.altuha6);
        }

    }
}