package com.nshumskii.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));

        Intent intent = getIntent();
        if (intent != null) {
            HashMap<String, String> elements = (HashMap<String, String>) intent.getSerializableExtra("elements");
            if (elements != null) {
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                for (HashMap.Entry<String, String> entry : elements.entrySet()) {
                    switch (entry.getKey()) {
                        case "button": {
                            Button button = new Button(getApplicationContext());
                            button.setLayoutParams(params);
                            button.setText(entry.getValue());
                            layout.addView(button);
                            break;
                        }
                        case "text_view": {
                            TextView textView = new TextView(getApplicationContext());
                            textView.setLayoutParams(params);
                            textView.setText(entry.getValue());
                            layout.addView(textView);
                            break;
                        }
                        case "edit_text": {
                            EditText editText = new EditText(getApplicationContext());
                            editText.setLayoutParams(params);
                            editText.setText(entry.getValue());
                            layout.addView(editText);
                            break;
                        }
                    }
                }
            }
        }

        setContentView(layout);

    }

}