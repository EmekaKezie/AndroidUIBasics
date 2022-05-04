package com.example.uibasics;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class ActivityCheckbox extends AppCompatActivity {

    private CheckBox got, lotr, vikings;
    private ProgressBar progressBar;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_checkbox);

        got = findViewById(R.id.got);
        lotr = findViewById(R.id.lotr);
        vikings = findViewById(R.id.vikings);

        progressBar = findViewById(R.id.progressbar);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    progressBar.incrementProgressBy(10);
                    SystemClock.sleep(500);
                }
            }
        });
        thread.start();

//        if(got.isChecked()){
//            Toast.makeText(ActivityThree.this, "You have watched Game of Thrones", Toast.LENGTH_LONG).show();
//        }else{
//            Toast.makeText(ActivityThree.this, "You need to watch Game of Thrones", Toast.LENGTH_SHORT).show();
//        }
//
//        got.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
//                if(isChecked){
//                    Toast.makeText(ActivityThree.this, "You have watched Game of Thrones", Toast.LENGTH_LONG).show();
//                }else{
//                    Toast.makeText(ActivityThree.this, "You need to watch Game of Thrones", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
        handleGOT(got);
    }

    private void handleGOT(CheckBox got) {
        if (got.isChecked()) {
            Toast.makeText(ActivityCheckbox.this, "You have watched Game of Thrones", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(ActivityCheckbox.this, "You need to watch Game of Thrones", Toast.LENGTH_SHORT).show();
        }
        got.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(ActivityCheckbox.this, "You have watched Game of Thrones", Toast.LENGTH_LONG).show();
                    progressBar.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(ActivityCheckbox.this, "You need to watch Game of Thrones", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void handleGotAgain() {

    }

}
