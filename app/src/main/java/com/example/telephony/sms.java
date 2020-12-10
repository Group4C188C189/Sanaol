package com.example.telephony;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sms extends AppCompatActivity {
    EditText editPhone, editMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        editPhone = (EditText)findViewById(R.id.editPhone);
        editMessage = (EditText)findViewById(R.id.editMessage);
    }


    // pag napindot yun send button maeexcute niya lahat ng code nung nasa loob ni  public void btnsend
    public void btnSend(View view) {

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);

        // pag na grant na yun permission ng sms pwede na makasend ng message
        if(permissionCheck==PackageManager.PERMISSION_GRANTED) {
            sendMessage();
        }else{
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS},0);
        }
    }

    // dito naman lalabas yun toast pag nakasend ng message. hindi ito gagana pag hindi na grant yun permission
    private void sendMessage() {

       String phone= editPhone.getText().toString().trim();
       String message= editMessage.getText().toString().trim();

        SmsManager smsManager = SmsManager.getDefault();

        smsManager.sendTextMessage(phone, null, message, null, null);

        Toast.makeText(this, "Message Sent", Toast.LENGTH_SHORT).show();


    }
}