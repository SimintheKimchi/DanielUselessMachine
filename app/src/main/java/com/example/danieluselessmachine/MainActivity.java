package com.example.danieluselessmachine;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonSelfDestruct;
    private Switch switchUseless;

    public static final String TAG = MainActivity.class.getSimpleName();
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
                    startSwitchOffTimer();
                    Toast.makeText(MainActivity.this, "OvO b", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "o.o p", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void startSwitchOffTimer() {
        new CountDownTimer(5000, 100) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(!switchUseless.isChecked()){
                    Log.d(TAG, "onTick: >_<");
                    cancel();
                }
            }

            @Override
            public void onFinish() {
                switchUseless.setChecked(false);
                Log.d(TAG, "onFinish: ;-;");
            }
        }.start();
    }


    private void wireWidgets() {
        buttonSelfDestruct = findViewById(R.id.button_main_tm64);
        switchUseless = findViewById(R.id.switch_main_useless);
    }
}
