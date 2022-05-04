package com.example.uibasics;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ActivityListview extends AppCompatActivity {

    private ListView citiesList;
    private Spinner studentsSpinner, coursesSpinner;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_listview);


        coursesList();
        studentsList();
        citiesList();


    }

    private void coursesList() {
        coursesSpinner = findViewById(R.id.coursesSpinner);


        coursesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ActivityListview.this, coursesSpinner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void studentsList() {
        studentsSpinner = findViewById(R.id.studentsSpinner);

        ArrayList<String> students = new ArrayList<>();
        students.add("Chinyere");
        students.add("Ngozi");
        students.add("Chizoba");
        students.add("Clara");
        students.add("Adaeze");

        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, students);
        studentsSpinner.setAdapter(studentsAdapter);

        studentsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ActivityListview.this, students.get(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void citiesList() {
        citiesList = findViewById(R.id.citiesList);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Port Harcout");
        cities.add("Lagos");
        cities.add("Yaunde");
        cities.add("Cotonu");
        cities.add("Accra");
        cities.add("Kumasi");
        cities.add("Entebe");
        cities.add("Johaneseburg");
        cities.add("Pretoria");

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cities);
        citiesList.setAdapter(citiesAdapter);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ActivityListview.this, cities.get(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
