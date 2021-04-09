package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvAns;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnMulti, btnZero, btnPlus, btnMinus, btnDivide, btnModules, btnEquals, btnClear;

    private String input, answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAns = findViewById(R.id.etAns);
        btn1 = findViewById(R.id.one);
        btn2 = findViewById(R.id.two);
        btn3 = findViewById(R.id.three);
        btn4 = findViewById(R.id.four);
        btn5 = findViewById(R.id.five);
        btn6 = findViewById(R.id.six);
        btn7 = findViewById(R.id.seven);
        btn8 = findViewById(R.id.eight);
        btn9 = findViewById(R.id.nine);
        btnMulti = findViewById(R.id.multi);
        btnZero = findViewById(R.id.zero);
        btnPlus = findViewById(R.id.plus);
        btnMinus = findViewById(R.id.minus);
        btnDivide = findViewById(R.id.divide);
        btnModules = findViewById(R.id.modules);
        btnEquals = findViewById(R.id.equals);
        btnClear = findViewById(R.id.clear);
    }

    public void ButtonClick(View view) {

        Button button = (Button) view;
        String data = button.getText().toString();
        switch (data) {
            case "Clear":
                input = "";
                break;
            case "Answer":
                input += answer;
                break;
            case "*":
                input += "*";
                break;
            case "=":
                solve();
                answer = input;
                break;
            default:
                if (input == null) {
                    input = "";
                }
                if (data.equals("+") || data.equals("-") || data.equals("/"))
                {
                    solve();
                }
                input+=data;
        }
        tvAns.setText(input);
    }
        private void solve ()
        {

            if (input.split("\\*").length==2)
            {
                String number[] = input.split("\\*");
                try {
                    double mul = Double.parseDouble(number[0]) * Double.parseDouble(number[1]);
                    input = mul+"";
                }catch (Exception e)
                {

                }
            }

            else if (input.split("/").length==2)
            {
                String number[] = input.split("/");
                try {
                    double div = Double.parseDouble(number[0]) / Double.parseDouble(number[1]);
                    input = div+"";
                }catch (Exception e)
                {

                }
            }
            else if (input.split("\\+").length==2)
            {
                String number[] = input.split("\\+");
                try {
                    double sum = Double.parseDouble(number[0]) + Double.parseDouble(number[1]);
                    input = sum+"";
                }catch (Exception e)
                {

                }
            }
            else if (input.split("-").length==2)
            {
                String number[] = input.split("-");
                if (number[0]=="" && number.length==2)
                {
                    number[0]=0+"";
                }
                try {

                   if (number.length==2)
                   {
                       double sub = Double.parseDouble(number[0]) - Double.parseDouble(number[1]);
                       input = sub+"";
                   }
                }catch (Exception e)
                {

                }
            }
            String n[] = input.split("\\.");
            if (n.length>1)
            {
                if (n[1].equals("0"))
                {
                    input=n[0];
                }
            }
            tvAns.setText(input);
    }
}