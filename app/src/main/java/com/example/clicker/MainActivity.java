package com.example.clicker;

import static java.lang.Math.random;

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

import java.util.Random;


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
    Random rand=new Random();;
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
        else if (counterClic==1000L) {
            clicAltushka.setImageResource(R.drawable.altuha5);
        }
        else if (counterClic==2000L) {
            clicAltushka.setImageResource(R.drawable.altuha6);
            TextClick.setText("STOP!!!!!");
        }
        else if (counterClic==2001L) {
            TextClick.setText("OK");
        }
        else if (counterClic>2001L){
            int max = 6; // Максимальное число для диапазона от 0 до max
            int min= 1; // Максимальное число для диапазона от 0 до max
            // Генерация случайного числа в диапазоне от min до max
            int randomNum = rand.nextInt(max - min + 1) + min;
            if (randomNum==1)
                clicAltushka.setImageResource(R.drawable.altuha);
            if (randomNum==2)
                clicAltushka.setImageResource(R.drawable.altuha2);
            if (randomNum==3)
                clicAltushka.setImageResource(R.drawable.altuha3);
            if (randomNum==4)
                clicAltushka.setImageResource(R.drawable.altuha4);
            if (randomNum==5)
                clicAltushka.setImageResource(R.drawable.altuha5);
            if (randomNum==6)
                clicAltushka.setImageResource(R.drawable.altuha6);
        }


    }
}