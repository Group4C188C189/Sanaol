package com.example.telephony;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void sms(View view) {
        Intent intent = new Intent(MainActivity.this,sms.class);
        startActivity(intent);
    }

    public void call(View view) {
        Intent intent = new Intent(MainActivity.this,call.class);
        startActivity(intent);
    }

    public void mmain(View view) {
        Intent intent = new Intent(MainActivity.this,sms.class);
        startActivity(intent);
    }

    public void mcall(View view) {
        Intent intent = new Intent(MainActivity.this,call.class);
        startActivity(intent);
    }

    public void memain(View view) {
        Intent intent = new Intent(MainActivity.this,sms.class);
        startActivity(intent);
    }

    public void mecall(View view) {
        Intent intent = new Intent(MainActivity.this,call.class);
        startActivity(intent);
    }

    public void tmain(View view) {
        Intent intent = new Intent(MainActivity.this,sms.class);
        startActivity(intent);
    }

    public void tcall(View view) {
        Intent intent = new Intent(MainActivity.this,call.class);
        startActivity(intent);
    }

    public void rmain(View view) {
        Intent intent = new Intent(MainActivity.this,sms.class);
        startActivity(intent);
    }

    public void rcall(View view) {
        Intent intent = new Intent(MainActivity.this,call.class);
        startActivity(intent);
    }
}