package com.example.absolventi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Decenii extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decenii);


        ImageView im=(ImageView)findViewById(R.id.imageView3);

        im.setScaleType(ImageView.ScaleType.FIT_XY);
        im.setElevation(1);

        final PanouData pd= (PanouData)getIntent().getSerializableExtra("PanouData");

        int y=pd.getSecol();
        String x= Integer.toString(y);
        setTitle(x);
        /*tex.setElevation(2);*/


        Button button= (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),Ani.class);
                pd.setDeceniu(0);
                intent.putExtra("PanouData",pd);
                startActivity(intent);
            }
        });

        Button button2= (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),Ani.class);
                pd.setDeceniu(1);
                intent.putExtra("PanouData",pd);
                startActivity(intent);
            }
        });

        Button button3= (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),Ani.class);
                pd.setDeceniu(2);
                intent.putExtra("PanouData",pd);
                startActivity(intent);
            }
        });

        Button button4= (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),Ani.class);
                pd.setDeceniu(3);
                intent.putExtra("PanouData",pd);
                startActivity(intent);
            }
        });

        Button button5= (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),Ani.class);
                pd.setDeceniu(4);
                intent.putExtra("PanouData",pd);
                startActivity(intent);
            }
        });
        Button button6= (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),Ani.class);
                pd.setDeceniu(5);
                intent.putExtra("PanouData",pd);
                startActivity(intent);
            }
        });
        Button button7= (Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),Ani.class);
                pd.setDeceniu(6);
                intent.putExtra("PanouData",pd);
                startActivity(intent);
            }
        });
        Button button8= (Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),Ani.class);
                pd.setDeceniu(7);
                intent.putExtra("PanouData",pd);
                startActivity(intent);
            }
        });
        Button button9= (Button)findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),Ani.class);
                pd.setDeceniu(8);
                intent.putExtra("PanouData",pd);
                startActivity(intent);
            }
        });
        Button button10= (Button)findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),Ani.class);
                pd.setDeceniu(9);
                intent.putExtra("PanouData",pd);
                startActivity(intent);
            }
        });
    }
/*    public void incepe(View v){
        Intent i=new Intent(this,Ani.class);
        startActivity(i);
    }*/
}
