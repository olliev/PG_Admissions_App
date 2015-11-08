package com.example.rdedhawk.pg;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class Register extends AppCompatActivity implements View.OnClickListener {
    Button register_newsletter;
    EditText register_firstname,register_lastname,register_emailid;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initialize();
        register_newsletter.setOnClickListener(this);
    }

    private void initialize() {
        register_firstname = (EditText) findViewById(R.id.register_firstname);
        register_lastname = (EditText) findViewById(R.id.register_lastname);
        register_emailid = (EditText) findViewById(R.id.register_emailid);
        register_newsletter = (Button) findViewById(R.id.register_newsletter);
        result = (TextView) findViewById(R.id.result);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.register_newsletter:
                String lastname = register_lastname.getText().toString();
                String firstname = register_firstname.getText().toString();
                String emailid = register_emailid.getText().toString();
                if(lastname.matches("") || firstname.matches("") || emailid.matches("")){
                    Toast.makeText(getApplicationContext(),"You have to enter all required details.",Toast.LENGTH_LONG).show();
                }else {
                  /*  Intent emailIntent = new Intent(Intent.ACTION_SEND);
                    emailIntent.setType("text/plain");
                    emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"anil946233@gmail.com"});
                    emailIntent.putExtra(Intent.EXTRA_SUBJECT, "subject here");
                    emailIntent.putExtra(Intent.EXTRA_TEXT, "body text");
                    File root = Environment.getExternalStorageDirectory();
                    String pathToMyAttachedFile = "temp/attachement.xml";
                    File file = new File(root, pathToMyAttachedFile);
                    if (!file.exists() || !file.canRead()) {
                        return;
                    }
                    Uri uri = Uri.fromFile(file);
                    emailIntent.putExtra(Intent.EXTRA_STREAM, uri);
                    startActivity(Intent.createChooser(emailIntent, "Pick an Email provider"));
                    */
                    result.setText("Dear " + firstname + " " + lastname + "\n" + "Your Emailid is " + emailid );

                }
                    break;
            default:
                register_firstname.setText("Your email id");
        }
    }
}
