package com.miumiuhaskeer.snoweffect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SnowEffect effect = findViewById(R.id.snowEffect);
        SnowElement element1 = new SnowElement(this, R.drawable.ic_round_element, R.color.colorBlueElement);
        SnowElement element2 = new SnowElement(this, R.drawable.ic_gift_element, R.color.colorRedElement);
        SnowElement element3 = new SnowElement(this, R.drawable.ic_snow_element, R.color.colorWhiteElement);

        effect.setElements(element1, element2, element3);
        effect.startShowing();
    }
}