package com.example.absolventi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Panou extends AppCompatActivity {

    private List<String> idList;
    private ImageButton diriginte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panou);

        idList = new ArrayList<>();
        final ArrayList<String> list_elevi =new ArrayList<>();
        final ArrayList<String> adresa_dirig =new ArrayList<>();

        diriginte=findViewById(R.id.imageButton);
        final PanouData pd= (PanouData)getIntent().getSerializableExtra("PanouData");
        int y=pd.getSecol();
        String x= Integer.toString(y);

        y=pd.getDeceniu();
        x+=Integer.toString(y);
        y=pd.getAn();
        x+=Integer.toString(y);
        Long an=Long.parseLong(x);
        String r=pd.getClasa();
        x+=r;

        //diriginte.setImageURI(Uri.parse("file:///C://DND/Ferd Claymore.png"));
        diriginte.setImageURI(Uri.parse("https://cdn.drawception.com/drawings/903210/v6MMJO9W74.png"));




        //1. SELECT * FROM Persoane
        //DatabaseReference reference= FirebaseDatabase.getInstance().getReference("Persoane");

        //SELECT Nume from Persoane where An=an AND Clasa=r
        //getPath(an,r);
        setTitle(x);

        DatabaseReference reference= FirebaseDatabase.getInstance().getReference().child("Persoane");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull  DataSnapshot dataSnapshot) {
                list_elevi.clear();
                for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                    Persoane pers=snapshot.getValue(Persoane.class);
                    if (pers.getYear() == an) {
                        if(pers.getClassy().equals(r)) {
                            if(pers.getStatut()=="Elev") {
                                String txt = pers.getAdresa();
                                list_elevi.add(txt);
                            }else if(pers.getStatut()=="Diriginte"){
                                adresa_dirig.add(pers.getAdresa());

                            }
                        }
                    }

                }

            }

            @Override
            public void onCancelled(@NonNull  DatabaseError databaseError) {

            }
        });
    }


}
