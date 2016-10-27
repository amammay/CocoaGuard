package com.cocoaguard.cocoaguard;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.cocoaguard.cocoaguard.R;

public class SocialMediaActivity extends AppCompatActivity
{
    private Button facebookButton;
    //private String url = "https://www.facebook.com/alex.mammay";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        facebookButton = (Button) findViewById(R.id.buttonFacebook);

        facebookButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String YourPageURL = "https://www.facebook.com/alex.mammay";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(YourPageURL));

                startActivity(browserIntent);
            }

        });
    }
}
