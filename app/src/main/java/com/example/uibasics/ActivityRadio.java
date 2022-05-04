package com.example.uibasics;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityRadio extends AppCompatActivity {

    private RadioGroup radioGroup;

    public void onCreate (Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_radio);

        radioGroup = findViewById(R.id.paymentMethod);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.cash:
                        Toast.makeText(ActivityRadio.this, "Cash Payment", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.transfer:
                        Toast.makeText(ActivityRadio.this, "Transfer", Toast.LENGTH_SHORT).show();
                    default:
                        break;
                }
            }
        });
    }
}
