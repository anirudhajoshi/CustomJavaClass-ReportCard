package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard r = new ReportCard();

        r.setEnglishGrade("C");
        r.setPhysicsGrade("B");
        r.setChemistryGrade("F");
        r.setBiologyGrade("A");
        r.setMathGrade("A");
        Log.i("MainActivity",r.toString());
    }
}
