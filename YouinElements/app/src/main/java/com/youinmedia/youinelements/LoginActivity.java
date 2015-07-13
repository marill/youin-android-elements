package com.youinmedia.youinelements;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import android.content.res.AssetManager;
import android.widget.EditText;

import java.util.Locale;


public class LoginActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        EditText un = (EditText)findViewById(R.id.username);
        EditText pw = (EditText)findViewById(R.id.password);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Roboto-Regular.ttf");

        un.setTypeface(custom_font);
        pw.setTypeface(custom_font);
    }
}
