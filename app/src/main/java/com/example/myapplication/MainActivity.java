package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button addButton, subButton, mulButton, divButton, clrButton;
    EditText inNum1, inNum2;
    TextView results;
    Double num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inNum1 = findViewById(R.id.inputNumber1);
        inNum2 = findViewById(R.id.inputNumber2);
        results = findViewById(R.id.numberResult);
    }

    public Double inputValidate(EditText editText) {
        if (editText.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "Enter Numbers Correctly", Toast.LENGTH_LONG).show();
            results.setText("Enter Numbers To Calculate !");
            return 0.0;
        } else {

            return Double.parseDouble(editText.getText().toString());

        }

    }


    public void Add(View view){
       num1  = inputValidate(inNum1);
       num2  = inputValidate(inNum2);


        //Calculation
        if(inNum1.getText().toString().equals("")){
            results.setText("Invalid !");
        }else {
            results.setText("Total = " + (num1 + num2));
        }
    }

    public void Sub(View view){
        num1  = inputValidate(inNum1);
        num2  = inputValidate(inNum2);


        //Calculation


        result = num1 - num2 ;

        results.setText("Total = " + result);
    }

    public void Mul(View view){
        num1  = inputValidate(inNum1);
        num2  = inputValidate(inNum2);


        //Calculation


        result = num1 * num2 ;

        results.setText("Total = " + result);;
    }

    public void Div(View view){
        num1  = inputValidate(inNum1);
        num2  = inputValidate(inNum2);


        //Calculation


        result = num1 / num2 ;

        results.setText("Total = " + result);
    }

    public void clearAll(View view){

        inNum1.setText("");
        inNum2.setText("");
        results.setText("");
    }

    @Override
    public void onClick(View v) {

    }
}