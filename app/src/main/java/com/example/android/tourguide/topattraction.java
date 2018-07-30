package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class topattraction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);
        //creating the arraylist to store dynamically
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.River),R.drawable.ic_ganga));
        places.add(new Place(getString(R.string.Bhu), R.drawable.ic_bhu));
        places.add(new Place(getString(R.string.Statue), R.drawable.ic_statue));
        places.add(new Place(getString(R.string.sarnath), R.drawable.ic_sarnath));
        places.add(new Place(getString(R.string.Chunar), R.drawable.ic_chunar));
        places.add(new Place(getString(R.string.mary), R.drawable.ic_mary));
        places.add(new Place(getString(R.string.Bharat), R.drawable.ic_bharat));

        //Custom adapter
        PlaceAdapter Adapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int postion, long id) {
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

