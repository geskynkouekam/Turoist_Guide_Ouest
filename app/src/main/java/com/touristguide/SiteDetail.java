package com.touristguide;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SiteDetail extends AppCompatActivity {
    private ImageView carImageView,backButton;
    private TextView siteNameView;
    private TextView siteAddressView;
    private TextView siteCategoryView;
    private TextView latitudeView;
    private TextView longitudeView;
    private TextView websiteView,siteDescriptionView,siteTitleView;
    private TextView ratingView;
    private TextView imageResourceIdView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.site_detail);
        // Get references to UI elements
        carImageView = findViewById(R.id.site_image_view);
        siteNameView = findViewById(R.id.site_title);
        siteAddressView = findViewById(R.id.site_address);
        siteCategoryView = findViewById(R.id.site_category);
        latitudeView = findViewById(R.id.site_latitude);
        longitudeView = findViewById(R.id.site_longitude);
        websiteView = findViewById(R.id.site_website);
        siteTitleView = findViewById(R.id.site_title2);
        siteDescriptionView = findViewById(R.id.site_description);
        ratingView = findViewById(R.id.site_rating);
        backButton = findViewById(R.id.to_site_list);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("siteName")) {
            String siteName = intent.getStringExtra("siteName");
            String siteAddress = intent.getStringExtra("siteAddress");
            String siteCategory = intent.getStringExtra("siteCategory");
            String siteDescription = intent.getStringExtra("siteDescription");
            String latitude = intent.getStringExtra("latitude");
            String longitude = intent.getStringExtra("longitude");
            String website = intent.getStringExtra("website");
            String rating = intent.getStringExtra("rating");
            int imageResourceId = Integer.parseInt(intent.getStringExtra("imageResourceId"));
            // Update UI elements with car data (replace with your logic)
            siteNameView.setText(siteName);
            String test = (String) siteDescriptionView.getText();
            siteTitleView.setText(test);
            siteAddressView.setText(siteAddress);
            siteCategoryView.setText(siteCategory);
            siteDescriptionView.setText(siteDescription);
            latitudeView.setText(latitude);
            longitudeView.setText(longitude);
            websiteView.setText(website);
            ratingView.setText(rating);
            // You can also load car image based on car name here (replace with your logic)
            carImageView.setImageResource(imageResourceId); // Example for a specific car image
        }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SiteDetail.this, SiteList.class);
                startActivity(intent);
            }
        });
    }
}


