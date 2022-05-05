package com.mohamed.trainer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public CardView cardBeginner, cardIntermediate, cardAdvanced;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardBeginner = (CardView) findViewById(R.id.iBeginners);
        cardBeginner.setOnClickListener(this);

        cardIntermediate = (CardView) findViewById(R.id.iIntermediate);
        cardIntermediate.setOnClickListener(this);

        cardAdvanced = (CardView) findViewById(R.id.iAdvanced);
        cardAdvanced.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.iBeginners:
                intent = new Intent(this, Beginners.class);
                startActivity(intent);
                break;

            case R.id.iIntermediate:
                intent = new Intent(this, Intermediate.class);
                startActivity(intent);
                break;

            case R.id.iAdvanced:
                intent = new Intent(this, Advanced.class);
                startActivity(intent);
                break;
        }
    }
}