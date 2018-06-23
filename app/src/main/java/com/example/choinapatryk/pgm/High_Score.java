package com.example.choinapatryk.pgm;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.Activity;
import android.widget.Toast;

public class High_Score extends AppCompatActivity {

    private ListView Lista;
    private String[] WynikLista;
    private int[] WynikPunkt;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high__score);
        Lista = (ListView) findViewById(R.id.High_Score_List);
        initResources();
        initWynikListView();
    }

    private void initResources() {
        Resources res = getResources();
        WynikLista = res.getStringArray(R.array.WynikList);
        WynikPunkt = res.getIntArray(R.array.WynikPunkt);
    }

    private void initWynikListView() {
        Lista.setAdapter(new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                WynikLista));

        Lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int pos, long id) {
                Toast.makeText(getApplicationContext(),
                        String.valueOf(WynikPunkt[pos]),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }



}
