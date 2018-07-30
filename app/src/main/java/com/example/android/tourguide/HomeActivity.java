package com.example.android.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        LinearLayout history = (LinearLayout) findViewById(R.id.history);

        // Set a click listener on that View
        history.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the album category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Activity}
                Intent historyIntent = new Intent(HomeActivity.this, history.class);

                // Start the new activity
                startActivity(historyIntent);
            }
        });

        LinearLayout topattraction = (LinearLayout) findViewById(R.id.topattraction);

        // Set a click listener on that View
        topattraction.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the nowplaying category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Activity}
                Intent topattractionIntent = new Intent(HomeActivity.this, topattraction.class);

                // Start the new activity
                startActivity(topattractionIntent);
            }
        });

        LinearLayout restaurants = (LinearLayout) findViewById(R.id.restaurants);

        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Activity}
                Intent restaurantsIntent = new Intent(HomeActivity.this,restaurants.class);

                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });

        LinearLayout sites = (LinearLayout) findViewById(R.id.sites);

        // Set a click listener on that View
        sites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the payment category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Activity}
                Intent sitesIntent = new Intent(HomeActivity.this, sites.class);

                // Start the new activity
                startActivity(sitesIntent);
            }
        });
    }
}
