package com.example.digitzapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class RandomNumberGenerator extends AppCompatActivity
{

   Button rngButton;
   TextView rngTextView;

   @Override
   protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_random_number_generator);

      // find the button and TextView from the xml file
      rngButton = (Button) findViewById(R.id.generateRNG);
      rngTextView = (TextView) findViewById(R.id.rngTextView);

      // make the button generate a random number between 1-100
      rngButton.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            // create instance of random class
            Random random = new Random();

            // generate the upper bound
            int upperBound = 101;

            // generate random number from 1-100 and save it to a variable
            int randomNumber = random.nextInt(upperBound);

            // show it to the TextView
            rngTextView.setText(String.valueOf(randomNumber));
         }
      });

   }
}