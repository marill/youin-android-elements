package com.youinmedia.youinelements;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText un = (EditText)findViewById(R.id.username);
        final EditText pw = (EditText)findViewById(R.id.password);
        TextView error = (TextView)findViewById(R.id.error_message);

        Typeface roboto_font = Typeface.createFromAsset(getAssets(),  "fonts/Roboto-Regular.ttf");

        un.setTypeface(roboto_font);
        pw.setTypeface(roboto_font);
        error.setTypeface(roboto_font);


        un.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (start >= 2) {
                    un.setBackgroundResource(R.drawable.textfield_valid);
                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            public void afterTextChanged(Editable s) {

            }
        });



    }
}
