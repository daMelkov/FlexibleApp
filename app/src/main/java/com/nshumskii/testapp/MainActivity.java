package com.nshumskii.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Switch tvSwitch = findViewById(R.id.tv_switch);
        final Switch etSwitch = findViewById(R.id.et_switch);
        final Switch btnSwitch = findViewById(R.id.btn_switch);

        Button btnStart = findViewById(R.id.button_start);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                HashMap<String, String> elements = new HashMap<>();
                if (tvSwitch.isChecked()) {
                    elements.put("text_view", "Hi all");
                }
                if (etSwitch.isChecked()) {
                    elements.put("edit_text", "Put here your name");
                }
                if (btnSwitch.isChecked()) {
                    elements.put("button", "Let's start");
                }
                intent.putExtra("elements", elements);
                startActivity(intent);
            }
        });
    }
}