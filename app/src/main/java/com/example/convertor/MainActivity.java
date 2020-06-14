package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.convertor.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText firstNumber= findViewById(R.id.number1);
        final EditText secondNumber= findViewById(R.id.number2);
        final RadioGroup operators= findViewById(R.id.operators);
        final RadioButton add= findViewById(R.id.add);
        final RadioButton subtract= findViewById(R.id.subtract);
        final RadioButton multiply= findViewById(R.id.multiply);
        final RadioButton divide= findViewById(R.id.divide);
        final Button calculate= findViewById(R.id.calculate);
        final TextView result= findViewById(R.id.result);

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final float firstNumberValue=Float.parseFloat(firstNumber.getText().toString());
                final float secondNumberValue=Float.parseFloat(secondNumber.getText().toString());
                final int operatorButtonId=operators.getCheckedRadioButtonId();
                Float answer;
                if(operatorButtonId==add.getId()){
                    answer=firstNumberValue+secondNumberValue;
                }
                else if(operatorButtonId==subtract.getId()) {
                    answer=firstNumberValue-secondNumberValue;
                }
                else if(operatorButtonId==multiply.getId()){
                    answer=firstNumberValue*secondNumberValue;
                }
                else{
                    answer=firstNumberValue/secondNumberValue;
                }
                result.setText(answer.toString());
            }
        });


    }
}