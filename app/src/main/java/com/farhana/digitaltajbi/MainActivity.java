package com.farhana.digitaltajbi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvcount;
    Button buttonadd,buttonsub,buttonreset;
    int count=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tvcount =findViewById(R.id.tvcount);
        buttonadd=findViewById(R.id.buttonadd);
        buttonsub=findViewById(R.id.buttonsub);
        buttonreset=findViewById(R.id.buttonreset);


//............................................
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=count+1;
                tvcount.setText(""+count);



            }
        });


        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                count=count-1;
                tvcount.setText(""+count);


            }
        });

        buttonreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                count=0;
                tvcount.setText(""+count);


            }
        });










    }
}