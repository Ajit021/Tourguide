package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class history extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);
        //creating the arraylist to store dynamically
         final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.ramnagar), R.drawable.ic_ramnagar));
        places.add(new Place(getString(R.string.Manikarnika), R.drawable.ic_manikarnika));
        places.add(new Place(getString(R.string.kashitemple), R.drawable.ic_kashi));
        places.add(new Place(getString(R.string.Darbhanga), R.drawable.ic_darbhanga));
        places.add(new Place(getString(R.string.Panchganga), R.drawable.ic_panchganga));

        //Custom adapter
        PlaceAdapter Adapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int postion, long id) {
                //to get the position
                Place place = places.get(postion);

                //to get the location of the place
                String mLocation=place.getmLocationInfo();

                //open the google map
                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+mLocation+", Varanasi");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                startActivity(mapIntent);

            }
        });
    }
}

