package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickAdd(View view) {
        String operand = "add";
        EditText integerInput1 = (EditText) findViewById(R.id.integerInput1);
        EditText integerInput2 = (EditText) findViewById(R.id.integerInput2);
        String value1 = integerInput1.getText().toString();
        String value2 = integerInput2.getText().toString();
        int finalValue1 =Integer.parseInt(value1);
        int finalValue2 =Integer.parseInt(value2);
        goToActivity2(finalValue1, finalValue2, operand);
    }

    public void clickSubtract(View view) {
        String operand = "subtract";
        EditText integerInput1 = (EditText) findViewById(R.id.integerInput1);
        EditText integerInput2 = (EditText) findViewById(R.id.integerInput2);
        String value1 = integerInput1.getText().toString();
        String value2 = integerInput2.getText().toString();
        int finalValue1 =Integer.parseInt(value1);
        int finalValue2 =Integer.parseInt(value2);
        goToActivity2(finalValue1, finalValue2, operand);
    }

    public void clickMultiply(View view) {
        String operand = "multiply";
        EditText integerInput1 = (EditText) findViewById(R.id.integerInput1);
        EditText integerInput2 = (EditText) findViewById(R.id.integerInput2);
        String value1 = integerInput1.getText().toString();
        String value2 = integerInput2.getText().toString();
        int finalValue1 =Integer.parseInt(value1);
        int finalValue2 =Integer.parseInt(value2);
        goToActivity2(finalValue1, finalValue2, operand);
    }

    public void clickDivide(View view) {
        String operand = "divide";
        EditText integerInput1 = (EditText) findViewById(R.id.integerInput1);
        EditText integerInput2 = (EditText) findViewById(R.id.integerInput2);
        String value1 = integerInput1.getText().toString();
        String value2 = integerInput2.getText().toString();
        int finalValue1 =Integer.parseInt(value1);
        int finalValue2 =Integer.parseInt(value2);
        goToActivity2(finalValue1, finalValue2, operand);
    }

    public void goToActivity2(Integer int1, Integer int2, String operand) {
        Integer returnVal = 0;
        if (operand == "add") {
            returnVal = int1 + int2;
        }
        else if (operand == "subtract") {
            returnVal = int1 - int2;
        }
        else if (operand == "multiply") {
            returnVal = int1 * int2;
        }
        else if (operand == "divide") {
            returnVal = int1 / int2;
        }
        String returnStr = returnVal.toString();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", returnStr);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}