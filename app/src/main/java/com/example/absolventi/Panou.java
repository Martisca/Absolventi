package com.example.absolventi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Panou extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panou);


        final PanouData pd= (PanouData)getIntent().getSerializableExtra("PanouData");

        int y=pd.getSecol();
        String x= Integer.toString(y);
        y=pd.getDeceniu();
        x+=Integer.toString(y);
        y=pd.getAn();
        x+=Integer.toString(y);
        String r=pd.getClasa();
        x+=r;
        setTitle(x);
    }
}
