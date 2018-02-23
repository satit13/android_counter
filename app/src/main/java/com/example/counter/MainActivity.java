package com.example.counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity
    implements View.OnClickListener {

    TextView txtCount;
    RadioButton radUp, radDown;
    Button btnCount;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCount = (TextView) findViewById(R.id.counter_value);
        radUp  = (RadioButton) findViewById(R.id.count_up_radio);
        radDown = (RadioButton) findViewById(R.id.count_down_radio);
        btnCount = (Button) findViewById(R.id.count_button);

        txtCount.setText(String.valueOf(10));
        btnCount.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        if (radUp.isChecked()){
            count++;
        } else if (radDown.isChecked()) {
            count--;
        }
        txtCount.setText(String.valueOf(count));
    }

}
