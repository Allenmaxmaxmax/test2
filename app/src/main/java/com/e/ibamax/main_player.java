package com.e.ibamax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.view.View;
import android.widget.ArrayAdapter;


public class main_player extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);

        Spinner spinner =  findViewById(R.id.spinner);
        final String[] lunch = {"輔仁大學", "台灣大學", "師範大學", "屏東大學", "好棒棒球隊"};
        ArrayAdapter<String> lunchList = new ArrayAdapter<>(main_player.this,
                android.R.layout.simple_spinner_dropdown_item,
                lunch);
        spinner.setAdapter(lunchList);

//換頁
        Button nextPageBtn =  findViewById(R.id.button);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(main_player.this, page2.class);
                startActivity(intent);
            }
        });


    }
}
