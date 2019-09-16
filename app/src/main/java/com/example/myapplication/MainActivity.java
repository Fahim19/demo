package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView countertxt;
    private Button minsBtn;
    private Button plusBtn;
    private Button resetBtn;
    private int counter;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.minBtn :
                    minsCounter();
                    break;
                case R.id.plusBtn :
                    plusCounter();
                    break;
                case R.id.resetBtn :
                    initCounter();
                    break;
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countertxt=(TextView) findViewById(R.id.counterTxt);
        minsBtn=(Button)findViewById(R.id.minBtn);
        minsBtn.setOnClickListener(clickListener);
        plusBtn=(Button)findViewById(R.id.plusBtn);
        plusBtn.setOnClickListener(clickListener);
        resetBtn=(Button)findViewById(R.id.resetBtn);
        resetBtn.setOnClickListener(clickListener);

        initCounter();
    }

    private void initCounter(){
        counter =0;
        countertxt.setText(counter + "");

    }
    private void plusCounter(){
        counter++;
        countertxt.setText(counter + "");
    }

    private void minsCounter(){
        counter--;
        countertxt.setText(counter + "");
    }
}
