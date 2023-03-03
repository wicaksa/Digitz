package com.example.digitzapp;

import android.os.Bundle;

import com.example.digitzapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Calculator extends AppCompatActivity
{

   // create button objects
   Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
      buttonAdd, buttonSubtract, buttonDivide, buttonMultiply, buttonEquals, buttonClear;

   // create TextView object
   TextView consoleTextView;

   // variables to store the two operands
   int firstNumber;
   int secondNumber;

   // variable store the result
   int result;

   // variable to store the operation
   char operator;

   // variable to know when you've finished calculations
   boolean finishedCalculating = false;

   @Override
   protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_calculator);

      // find each button id
      button0 = (Button) findViewById(R.id.button0);
      button1 = (Button) findViewById(R.id.button1);
      button2 = (Button) findViewById(R.id.button2);
      button3 = (Button) findViewById(R.id.button3);
      button4 = (Button) findViewById(R.id.button4);
      button5 = (Button) findViewById(R.id.button5);
      button6 = (Button) findViewById(R.id.button6);
      button7 = (Button) findViewById(R.id.button7);
      button8 = (Button) findViewById(R.id.button8);
      button9 = (Button) findViewById(R.id.button9);
      buttonClear = (Button) findViewById(R.id.buttonClear);
      buttonAdd = (Button) findViewById(R.id.buttonPlus);
      buttonSubtract = (Button) findViewById(R.id.buttonMin);
      buttonMultiply = (Button) findViewById(R.id.buttonMult);
      buttonDivide = (Button) findViewById(R.id.buttonDiv);
      buttonEquals = (Button) findViewById(R.id.buttonEquals);

      // find the TextView that will show display
      consoleTextView = (TextView) findViewById(R.id.consoleTextBox);

      // create action listeners for each button
      // when clicked, make it show up in the TextView

      // button 0
      button0.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            // auto clear screen if you are starting a new calculation
            if (finishedCalculating)
            {
               clear();
               finishedCalculating = false;
            }
            consoleTextView.setText(consoleTextView.getText().toString() + "0");
         }
      });

      // button 1
      button1.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            // auto clear screen if you are starting a new calculation
            if (finishedCalculating)
            {
               clear();
               finishedCalculating = false;
            }
            consoleTextView.setText(consoleTextView.getText().toString() + "1");
         }
      });

      // button 2
      button2.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            // auto clear screen if you are starting a new calculation
            if (finishedCalculating)
            {
               clear();
               finishedCalculating = false;
            }
            consoleTextView.setText(consoleTextView.getText().toString() + "2");
         }
      });

      // button 3
      button3.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            // auto clear screen if you are starting a new calculation
            if (finishedCalculating)
            {
               clear();
               finishedCalculating = false;
            }
            consoleTextView.setText(consoleTextView.getText().toString() + "3");
         }
      });

      // button 4
      button4.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            // auto clear screen if you are starting a new calculation
            if (finishedCalculating)
            {
               clear();
               finishedCalculating = false;
            }
            consoleTextView.setText(consoleTextView.getText().toString() + "4");
         }
      });

      // button 5
      button5.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            // auto clear screen if you are starting a new calculation
            if (finishedCalculating)
            {
               clear();
               finishedCalculating = false;
            }
            consoleTextView.setText(consoleTextView.getText().toString() + "5");
         }
      });

      // button 6
      button6.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            // auto clear screen if you are starting a new calculation
            if (finishedCalculating)
            {
               clear();
               finishedCalculating = false;
            }
            consoleTextView.setText(consoleTextView.getText().toString() + "6");
         }
      });

      // button 7
      button7.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            // auto clear screen if you are starting a new calculation
            if (finishedCalculating)
            {
               clear();
               finishedCalculating = false;
            }
            consoleTextView.setText(consoleTextView.getText().toString() + "7");
         }
      });

      // button 8
      button8.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            // auto clear screen if you are starting a new calculation
            if (finishedCalculating)
            {
               clear();
               finishedCalculating = false;
            }
            consoleTextView.setText(consoleTextView.getText().toString() + "8");
         }
      });

      // button 9
      button9.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            // auto clear screen if you are starting a new calculation
            if (finishedCalculating)
            {
               clear();
               finishedCalculating = false;
            }
            consoleTextView.setText(consoleTextView.getText().toString() + "9");
         }
      });

      // clear
      buttonClear.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            consoleTextView.setText(null);
         }

      });

      buttonAdd.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            // if no numbers have been entered yet, do nothing
            if (consoleTextView.getText() == null)
            {

            } else
            {
               // save the first string into a variable
               firstNumber = Integer.parseInt(consoleTextView.getText().toString());
               // set operator to "add"
               operator = '+';
               // clear screen
               clear();
            }

         }
      });

      buttonSubtract.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            // if no numbers have been entered yet, do nothing
            if (consoleTextView.getText() == null)
            {

            } else
            {
               // save the first string into a variable
               firstNumber = Integer.parseInt(consoleTextView.getText().toString());
               // set operator to "add"
               operator = '-';
               // clear screen
               clear();
            }
         }
      });

      buttonMultiply.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            // if no numbers have been entered yet, do nothing
            if (consoleTextView.getText() == null)
            {

            } else
            {
               // save the first string into a variable
               firstNumber = Integer.parseInt(consoleTextView.getText().toString());
               // set operator to "add"
               operator = '*';
               // clear screen
               clear();
            }
         }
      });

      buttonDivide.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            // if no numbers have been entered yet, do nothing
            if (consoleTextView.getText() == null)
            {

            } else
            {
               // save the first string into a variable
               firstNumber = Integer.parseInt(consoleTextView.getText().toString());
               // set operator to "add"
               operator = '/';
               // clear screen
               clear();
            }
         }
      });

      buttonEquals.setOnClickListener(new View.OnClickListener()
      {
         @Override
         public void onClick(View v)
         {
            // get the second number
            secondNumber = Integer.parseInt(consoleTextView.getText().toString());

            // case statement to do the operators
            switch (operator)
            {
               case '+':
                  // do the arithmetic and store the result
                  result = firstNumber + secondNumber;
                  // show result to console
                  consoleTextView.setText(String.valueOf(result));
                  break;
               case '-':
                  // do the arithmetic and store the result
                  result = firstNumber - secondNumber;
                  // show result to console
                  consoleTextView.setText(String.valueOf(result));
                  break;
               case '*':
                  // do the arithmetic and store the result
                  result = firstNumber * secondNumber;
                  // show result to console
                  consoleTextView.setText(String.valueOf(result));
                  break;
               case '/':
                  // do the arithmetic and store the result
                  result = firstNumber / secondNumber;
                  // show result to console
                  consoleTextView.setText(String.valueOf(result));
                  break;
               default:
                  consoleTextView.setText("ERROR");
                  break;
            }

            // set finished calculating
            finishedCalculating = true;
         }
      });
   }

   // clears the screen
   private void clear()
   {
      consoleTextView.setText(null);
   }

}