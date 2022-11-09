package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button buttonAdd, buttonSubtract, buttonMultiply,
                   buttonClean, buttonDivide, buttonGrade;
    private TextView result, operation;
    private EditText number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonClean = findViewById(R.id.buttonClean);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonGrade = findViewById(R.id.buttonGrade);
        operation = findViewById(R.id.operation);
        result = findViewById(R.id.result);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);

        buttonAdd.setOnClickListener(this);
        buttonSubtract.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonClean.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonGrade.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        float num1 = 0;
        float num2 = 0;
        float res = 0;

        num1 = Float.parseFloat(number1.getText().toString());
        num2 = Float.parseFloat(number2.getText().toString());

        switch (view.getId()) {
            case R.id.buttonAdd:
                operation.setText("+");
                res = num1 + num2;
                break;
            case R.id.buttonSubtract:
                operation.setText("-");
                res = num1 - num2;
                break;
            case R.id.buttonDivide:
                operation.setText("/");
                res = num1 / num2;
                break;
            case R.id.buttonMultiply:
                operation.setText("*");
                res = num1 * num2;
                break;
            case R.id.buttonGrade:
                operation.setText("^");
                res = (float) Math.pow(num1, num2);
                break;
            case R.id.buttonClean:
                number1.setText("");
                number2.setText("");
                operation.setText("");
                result.setText("");
                break;
            default:
                break;
        }
        result.setText(res+"");

    }
}