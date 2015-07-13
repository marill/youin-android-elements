package com.youinmedia.youinelements;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AddFriendsActivity extends AppCompatActivity {
    Button facebookButton;
    Button lightningGroupsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friends);

        facebookButton = (Button)findViewById(R.id.facebook_button);
        lightningGroupsButton = (Button)findViewById(R.id.lightning_groups_button);

        // Set correct font
        Typeface roboto_font = Typeface.createFromAsset(getAssets(),  "fonts/Roboto-Regular.ttf");
        facebookButton.setTypeface(roboto_font);
        lightningGroupsButton.setTypeface(roboto_font);


    }
}
