package com.example.myapplication;

import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn ;
    ServiceFalse SF;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SF = new ServiceFalse();

        btn = findViewById(R.id.save);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SF.trueth();

            }
        });
        final Intent False = new Intent(MainActivity.this,ServiceFalse.class);
        startService(False);

    }

    @Override
    public void onClick(View v) {
        SF.trueth();
    }
}
