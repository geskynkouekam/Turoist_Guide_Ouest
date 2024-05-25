package com.touristguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class SiteList extends AppCompatActivity {
    private ListView listView,catView;
    private ImageButton backButton;
    private Button moreButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.site_list_layout);
        backButton = findViewById(R.id.map_item_back_btn);
        listView = findViewById(R.id.site_list);
//        catView = findViewById(R.id.category_list);
        ArrayList<TouristSiteDetail> touristSites = new ArrayList<TouristSiteDetail>();

        touristSites.add(new TouristSiteDetail(
                "La vailee de bana",
                "World's largest coral reef system composed of over 2,900 individual reefs",
                R.drawable.site1,
                "Hotel",
                "Bana Ouset cameroon",
                -19.3444,
                149.1248,
                "https://www.gbrmpa.gov.au/",
                4.7
        ));

        touristSites.add(new TouristSiteDetail(
                "Palais des sultans Bamouns",
                "Historical landmark and UNESCO World Heritage Site",
                R.drawable.site3,
                "tourist site",
                "Fombou Ouest Cameroon",
                40.43,
                116.57,
                "",
                4.5
        ));

        touristSites.add(new TouristSiteDetail(
                "Mount Cameroon",
                "Iconic volcano revered in Japanese culture",
                R.drawable.site5,
                "Mountain",
                "Buea South Ouest",
                35.3636,
                138.7313,
                "https://www.fujisan.net/",
                4.8
        ));

        touristSites.add(new TouristSiteDetail(
                "Musee des Rois Bamoun",
                "Large museum showcasing a vast collection of antiquities",
                R.drawable.site2,
                "Museum",
                "Fombou Ouest Cameroon",
                51.5193,
                -0.1268,
                "https://www.britishmuseum.org/",
                4.6
        ));

        touristSites.add(new TouristSiteDetail(
                "Bandjoun Station",
                "One of the world's largest and most famous museums",
                R.drawable.site4,
                "Museum",
                "Bandjoun Ouest Cameroon",
                48.8600,
                2.3372,
                "https://www.louvre.fr/",
                4.9
        ));
        touristSites.add(new TouristSiteDetail(
                "Chute d'Ekom Nkam",
                "One of the world's largest and most famous museums",
                R.drawable.site6,
                "Museum",
                "Ekom Nkam Ouest Cameroon",
                48.8600,
                2.3372,
                "https://www.louvre.fr/",
                4.9
        ));


        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            }
        });
        ArrayList<String> data = new ArrayList<String>();
        data.add("Place");
        data.add("Hotel");
        data.add("Food");
        // Create a custom adapter for the ListView
//        MyAdapterCategoryList  catAdapter = new MyAdapterCategoryList(this, data);
//        catView.setAdapter(catAdapter);
        MyAdapterSiteList adapter = new MyAdapterSiteList(this, touristSites);
        listView.setAdapter(adapter);
    }

}
