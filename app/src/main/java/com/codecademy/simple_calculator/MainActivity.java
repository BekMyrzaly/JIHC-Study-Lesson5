package com.codecademy.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7,
            btn8, btn9, btnC, btnpm, btnper,
            btndel, btnmul, btnminus, btnplus,
            btnequal, btndot;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnC = findViewById(R.id.btnC);
        btnpm = findViewById(R.id.btnpm);
        btnper = findViewById(R.id.btnper);
        btndel = findViewById(R.id.btndel);
        btnmul = findViewById(R.id.btnmul);
        btnminus = findViewById(R.id.btnminus);
        btnplus = findViewById(R.id.btnplus);
        btnequal = findViewById(R.id.btnequal);
        btndot = findViewById(R.id.btndot);
        textView = findViewById(R.id.textView);

        View.OnClickListener button_num = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first_num = textView.getText().toString();
                String second_num = "";
                String result = "";
                switch (v.getId()){
                    case R.id.btn0:
                        second_num =  "0";
                        break;
                    case R.id.btn1:
                        second_num =  "1";
                        break;
                    case R.id.btn2:
                        second_num =  "2";
                        break;
                    case R.id.btn3:
                        second_num =  "3";
                        break;
                    case R.id.btn4:
                        second_num =  "4";
                        break;
                    case R.id.btn5:
                        second_num =  "5";
                        break;
                    case R.id.btn6:
                        second_num =  "6";
                        break;
                    case R.id.btn7:
                        second_num =  "7";
                        break;
                    case R.id.btn8:
                        second_num =  "8";
                        break;
                    case R.id.btn9:
                        second_num =  "9";
                        break;
                }
                if(first_num.equals("0")){
                    result = second_num;
                }else{
                    result = first_num + second_num;
                }
                textView.setText(result);

            }
        };
        btn0.setOnClickListener(button_num);
        btn1.setOnClickListener(button_num);
        btn2.setOnClickListener(button_num);
        btn3.setOnClickListener(button_num);
        btn4.setOnClickListener(button_num);
        btn5.setOnClickListener(button_num);
        btn6.setOnClickListener(button_num);
        btn7.setOnClickListener(button_num);
        btn8.setOnClickListener(button_num);
        btn9.setOnClickListener(button_num);


        View.OnClickListener clear_pl_min = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btnC:
                        textView.setText("0");
                        break;
                    case R.id.btnpm:
                        String viewT = textView.getText().toString();
                        int intviewT = Integer.parseInt(viewT);
                        if(intviewT > 0){
                            textView.setText("-" + viewT);
                        }else{
                            intviewT = intviewT * (-1);
                            textView.setText(""+intviewT);
                        }
                        break;
                }

            }
        };

        btnC.setOnClickListener(clear_pl_min);
        btnpm.setOnClickListener(clear_pl_min);

    }

}