package com.deemah.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    public boolean flag=true;

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        b1= findViewById(R.id.btn1);
        b2= findViewById(R.id.btn2);
        b3= findViewById(R.id.btn3);
        b4= findViewById(R.id.btn4);
        b5= findViewById(R.id.btn5);
        b6= findViewById(R.id.btn6);
        b7= findViewById(R.id.btn7);
        b8= findViewById(R.id.btn8);
        b9= findViewById(R.id.btn9);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClicked(b1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClicked(b2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClicked(b3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClicked(b4);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClicked(b5);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClicked(b6);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClicked(b7);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClicked(b8);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClicked(b9);
            }
        });
    }

    public void btnClicked(Button button){
        if(button.isEnabled()) {
            if(flag){
                button.setBackgroundColor(getResources().getColor(R.color.red));
                button.setText("X");
                button.setEnabled(false);
                flag=false;
            }else{
                button.setBackgroundColor(getResources().getColor(R.color.purple));
                button.setText("O");
                button.setEnabled(false);
                flag=true;
            }
        }

    }
}