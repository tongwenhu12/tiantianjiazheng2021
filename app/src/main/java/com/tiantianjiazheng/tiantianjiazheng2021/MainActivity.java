package com.tiantianjiazheng.tiantianjiazheng2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void seeJob(View view) {
        Intent intent = new Intent(getApplicationContext(),JobActivity3.class);
        startActivity(intent);
    }

    public void seeTraining(View view) {
        Intent intent = new Intent(getApplicationContext(),TrainingActivity3.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intentBackgroundService = new Intent(this,FirebasePushNotificationClass.class);
        startService(intentBackgroundService);

    }

}