package com.example.digitzapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
   LinearLayout calculator;
   LinearLayout rng;

   @Override
   protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      // find both layouts
      calculator = (LinearLayout) findViewById(R.id.calculatorLayout);
      rng = (LinearLayout) findViewById(R.id.rngLayout);

      // set up action listeners for the calculator
      calculator.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            Intent intent = new Intent(MainActivity.this, Calculator.class);
            startActivity(intent);
         }
      });

      // set up action listeners for the rng
      rng.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            Intent intent = new Intent(MainActivity.this, RandomNumberGenerator.class);
            startActivity(intent);
         }
      });
   }
}