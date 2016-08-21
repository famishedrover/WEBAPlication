package com.example.muditverma.webapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class FirstActivity extends AppCompatActivity
        implements View.OnClickListener {
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);

    }


    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("link", editText.getText().toString());
        startActivity(intent);
        Log.i("FirstActivity", editText.getText().toString());


    }

}
