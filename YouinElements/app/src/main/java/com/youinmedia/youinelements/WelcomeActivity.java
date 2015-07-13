package com.youinmedia.youinelements;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;



public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        final Button signUp = (Button)findViewById(R.id.sign_up_button);
        final Button signIn = (Button)findViewById(R.id.sign_in_button);

        Typeface roboto_font = Typeface.createFromAsset(getAssets(),  "fonts/Roboto-Regular.ttf");

        signIn.setTypeface(roboto_font);
        signUp.setTypeface(roboto_font);

    }

    // Sign up button clicked
    public void signUpUser(View view) {
        //Intent intent = new Intent(this, LoginActivity.class);
        //startActivity(intent);
    }

    // Sign in button clicked
    public void signInUser(View view) {
        //Intent intent = new Intent(this, LoginActivity.class);
        //startActivity(intent);
    }

}
