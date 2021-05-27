package com.example.absolventi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Clase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase);


        ImageView im=(ImageView)findViewById(R.id.imageView3);

        im.setScaleType(ImageView.ScaleType.FIT_XY);
        //im.setElevation(1);


        final PanouData pd= (PanouData)getIntent().getSerializableExtra("PanouData");

        int y=pd.getSecol();
        String x= Integer.toString(y);
        y=pd.getDeceniu();
        x+=Integer.toString(y);
        y=pd.getAn();
        x+=Integer.toString(y);
        setTitle(x);

        Button button= (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),Panou.class);
                pd.setClasa(" A");
                intent.putExtra("PanouData",pd);
                startActivity(intent);
            }
        });

        Button button2= (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),Panou.class);
                pd.setClasa(" B");
                intent.putExtra("PanouData",pd);
                startActivity(intent);
            }
        });

        Button button3= (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),Panou.class);
                pd.setClasa(" C");
                intent.putExtra("PanouData",pd);
                startActivity(intent);
            }
        });

        Button button4= (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),Panou.class);
                pd.setClasa(" D");
                intent.putExtra("PanouData",pd);
                startActivity(intent);
            }
        });

        Button button5= (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),Panou.class);
                pd.setClasa(" E");
                intent.putExtra("PanouData",pd);
                startActivity(intent);
            }
        });
    }
/*    public void incepe(View v){
        Intent i=new Intent(this,Panou.class);
        startActivity(i);
    }*/
}
