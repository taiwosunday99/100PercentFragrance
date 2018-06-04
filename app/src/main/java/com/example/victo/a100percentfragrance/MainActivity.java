package com.example.victo.a100percentfragrance;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String mymail;
    String myp;

    EditText myEmail;
    EditText myPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void clickContinue(View view) {

        myEmail = findViewById(R.id.myEmail);
        myPass = findViewById(R.id.myPass);

        myEmail.getText();
        myPass.getText();

        mymail = "admin";
        myp = "admin";

        if (myEmail.getText().toString().equals(mymail) && myPass.getText().toString().equals(myp)){

            Intent i = new Intent(getApplicationContext(), PercentFragrance.class);
            startActivity(i);


        }else {

            Toast.makeText(getApplicationContext(), "The Email/Password is invalid", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
