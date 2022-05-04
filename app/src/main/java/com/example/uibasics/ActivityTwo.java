package com.example.uibasics;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {

    private EditText edTxt;
    private TextView txtView;


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnHello:
                Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
                txtView.setText("Hello " + edTxt.getText().toString());
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);

        edTxt = findViewById(R.id.edTxt);
        txtView = findViewById(R.id.txtView);
    }
}
