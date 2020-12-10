package com.example.telephony;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class call extends AppCompatActivity {
    EditText editPhone;
    Button btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        editPhone = (EditText)findViewById(R.id.editPhone);
        btnCall = (Button)findViewById(R.id.btnCall);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_CALL);
                String number = editPhone.getText().toString();

                if (number.trim().isEmpty()) {
                    Toast.makeText(call.this, "Please Enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    intentCall.setData(Uri.parse("tel:" + number));
                }

                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(call.this, "Please Grant Permission", Toast.LENGTH_SHORT).show();
                    requestPermission();
                } else {
                    startActivity(intentCall);
                }

            }

        });
    }

    public void requestPermission(){
        ActivityCompat.requestPermissions(call.this,new String[]{Manifest.permission.CALL_PHONE}, 1);
    }


//
//    public void setBtnCall(View view){
//
//        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);
//
//        if (permissionCheck== PackageManager.PERMISSION_GRANTED) {
//
//            String phoneNum = editPhone.getText().toString().trim();
//
//            Intent callIntent = new Intent(Intent.ACTION_CALL);
//
//            callIntent.setData(Uri.parse("tel:+phoneNum"));
//
//            startActivity(callIntent);
//
//        }
//        else {
//
//            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},0);
//        }
//    }
}