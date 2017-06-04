package com.example.rishavroy.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int c = 0;
    TextView counterText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterText = (TextView) findViewById(R.id.Text);
        counterText.setText(String.valueOf(c));
    }

    public void startCount(View view) {
        c = c + 1;
        counterText.setText(String.valueOf(c));
    }
}
