package com.naya.mainapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Email extends AppCompatActivity {
    private EditText sub,content,to;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        sub = findViewById(R.id.et_subject);
        content = findViewById(R.id.et_mail);

        Button btn_send = findViewById(R.id.btn_sendmail);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendmail();
            }
        });
    }

    private void sendmail() {
       // String recp = to.getText().toString();
        String[] recipants = {"srhrmereliye.ai@gmail.com"};
        String subject = sub.getText().toString();
        String msg = content.getText().toString();

        Intent i = new Intent(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_EMAIL,recipants);
        i.putExtra(Intent.EXTRA_SUBJECT,subject);
        i.putExtra(Intent.EXTRA_TEXT,msg);

        i.setType("messege/rfc822");
        startActivity(Intent.createChooser(i,"Choose Email Client"));
    }
}