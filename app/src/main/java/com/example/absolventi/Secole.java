package com.example.absolventi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Secole extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secole);
        setTitle(" ");

        ImageView im=(ImageView)findViewById(R.id.imageView3);

        im.setScaleType(ImageView.ScaleType.FIT_XY);
        //im.setElevation(1);

        Button button= (Button)findViewById(R.id.button1) ;
        button.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),Decenii.class);
                PanouData pd= new PanouData(19,0,0,"z");
                intent.putExtra("PanouData",pd);
                startActivity(intent);
            }
        });

        Button button2= (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),Decenii.class);
                PanouData pd= new PanouData(20,0,0,"z");
                intent.putExtra("PanouData",pd);
                startActivity(intent);
            }
        });
    }



/*    public void incepe(View v){
        Intent i=new Intent(this,Decenii.class);
        i.putExtra(info,int[]);
        startActivity(i);
    }*/

}
