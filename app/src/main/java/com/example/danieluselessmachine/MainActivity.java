package com.example.danieluselessmachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonSelfDestruct;
    private Switch switchUseless;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
    }

    private void setListeners() {
        switchUseless.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "OvO b", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "o.o p", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void wireWidgets() {
        buttonSelfDestruct = findViewById(R.id.button_main_tm64);
        switchUseless = findViewById(R.id.switch_main_useless);
    }
}
