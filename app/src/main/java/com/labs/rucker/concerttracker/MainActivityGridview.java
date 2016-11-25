package com.labs.rucker.concerttracker;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivityGridview extends AppCompatActivity implements DataAdapterView.ClickListener, SearchView.OnQueryTextListener {

    SearchView searchView;
    EditText searchTxt;
    ImageButton searchbtn;

    public static final String ARTIST_DETAIL_KEY = "artist";

    private final String android_version_names[] = {
            "Skrillex",
            "Beyonce",
            "Adele",
            "Barbra Streisand",
            "Billy Joel",
            "Black Sabbath",
            "Blink-182",
            "Bonnie Raitt",
            "Brantley Gilbert",
            "Britney Spears",
            "Bruce Springsteen",
            "Carrie Underwood",
            "Chris Botti",
            "Coldplay",
            "The Cure",
            "Dave Matthews Band",
            "Demi Lovato",
            "Dixie Chicks",
            "Drake",
            "Ellie Goulding",
            "Elton John",
            "Guns N Roses",
            "Gwen Stefani",
            "Jason Aldean",
            "Justin Bieber",
            "Kanye West",
            "Kenny Chesney",
            "Luke Bryan",
            "The Lumineers",
            "Maroon 5",
            "Paul McCartney",
            "Pearl Jam",
            "Prophets of Rage",
            "Selena Gomez",
            "Twenty One Pilots",
            "Weezer",
            "Willie Nelson",
            "Zac Brown Band"
    };

    private final String android_image_urls[] = {
//https://s3.amazonaws.com/bit-photos/large/6115532.jpeg//
            "https://s3.amazonaws.com/bit-photos/large/6278128.jpeg",//SKRILLEX
            "https://s3.amazonaws.com/bit-photos/large/5445592.jpeg",//Beyonce
            "https://s3.amazonaws.com/bit-photos/large/6115532.jpeg",//adele
            "https://s3.amazonaws.com/bit-photos/large/141062.jpeg", //Barbra Streisand
            "https://s3.amazonaws.com/bit-photos/large/5289660.jpeg",// Billy Joel
            "https://s3.amazonaws.com/bit-photos/large/5994252.jpeg",        //   "Black Sabbath",
            "https://s3.amazonaws.com/bit-photos/large/6607941.jpeg",       //"Blink-182",
            "https://s3.amazonaws.com/bit-photos/large/6115549.jpeg",              //"Bonnie Raitt",
            "https://s3.amazonaws.com/bit-photos/large/6278969.jpeg",    // "Brantley Gilbert"
            "https://s3.amazonaws.com/bit-photos/large/5165410.jpeg",       //"Britney Spears",
            "https://s3.amazonaws.com/bit-photos/large/6340599.jpeg",    //"Bruce Springsteen",
            "https://s3.amazonaws.com/bit-photos/large/6176821.jpeg",      //"Carrie Underwood",
            "https://s3.amazonaws.com/bit-photos/large/6374857.jpeg",    //"Chris Botti",
            "https://s3.amazonaws.com/bit-photos/large/6605943.jpeg",      //"Coldplay",
            "https://s3.amazonaws.com/bit-photos/large/6091777.jpeg",       //"The Cure",
            "https://s3.amazonaws.com/bit-photos/large/6163283.jpeg",          //"Dave Matthews Band",
            "https://s3.amazonaws.com/bit-photos/large/6671159.jpeg",            //"Demi Lovato",
            "https://s3.amazonaws.com/bit-photos/large/6370716.jpeg",          //"Dixie Chicks",
            "https://s3.amazonaws.com/bit-photos/large/6527020.jpeg",             //"Drake",
            "https://s3.amazonaws.com/bit-photos/large/5194987.jpeg",              //"Ellie Goulding",
            "https://s3.amazonaws.com/bit-photos/large/5994336.jpeg",          //"Elton John",
            "https://s3.amazonaws.com/bit-photos/large/6173776.jpeg",              //"Guns N Roses",
            "https://s3.amazonaws.com/bit-photos/large/6162183.jpeg",          //"Gwen Stefani",
            "https://s3.amazonaws.com/bit-photos/large/6348758.jpeg",       //"Jason Aldean",
            "https://s3.amazonaws.com/bit-photos/large/6179382.jpeg",          //"Justin Bieber",
            "https://s3.amazonaws.com/bit-photos/large/5119190.jpeg",             //"Kanye West",
            "https://s3.amazonaws.com/bit-photos/large/6171513.jpeg",          //"Kenny Chesney",
            "https://s3.amazonaws.com/bit-photos/large/6590243.jpeg",           //"Luke Bryan",
            "https://s3.amazonaws.com/bit-photos/large/6594753.jpeg",             //"The Lumineers",
            "https://s3.amazonaws.com/bit-photos/large/6248271.jpeg",       //"Maroon 5",
            "https://s3.amazonaws.com/bit-photos/large/6115546.jpeg",          //"Paul McCartney",
            "https://s3.amazonaws.com/bit-photos/large/5421099.jpeg",              //"Pearl Jam",
            "https://s3.amazonaws.com/bit-photos/large/6519146.jpeg",                //"Prophets of Rage",
            "https://s3.amazonaws.com/bit-photos/large/5564666.jpeg",           //"Selena Gomez",
            "https://s3.amazonaws.com/bit-photos/large/6351375.jpeg",           //"Twenty One Pilots",
            "https://s3.amazonaws.com/bit-photos/large/3880819.jpeg",               //"Weezer",
            "https://s3.amazonaws.com/bit-photos/large/6038820.jpeg",             //"Willie Nelson",
            "https://s3.amazonaws.com/bit-photos/large/6132399.jpeg",             //"Zac Brown Band"


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gridview);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        initViews();

    }
    public void sendMessage(View view){
        Intent intent = new Intent(this, MainActivitySearch.class);
        EditText searchTxt = (EditText) findViewById(R.id.searchText);
        String searchStn = searchTxt.getText().toString();
        intent.putExtra("ITEM", searchStn);
        startActivity(intent);
    }


//    @Override
//
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        MenuItem searchItem = menu.findItem(R.id.action_search);
//        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
//        return true;
//    }


    private void initViews() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<AndroidVersion> androidVersions = prepareData();
        DataAdapterView adapter = new DataAdapterView(getApplicationContext(), androidVersions);
        recyclerView.setAdapter(adapter);
        adapter.setClickListener(this);

//        ImageButton searchBtn = (ImageButton) findViewById(R.id.searchButton);
//        EditText searchTxt = (EditText) findViewById(R.id.searchText);
//
//       // searchBtn.setOnClickListener(this);

    }

    private ArrayList<AndroidVersion> prepareData() {

        ArrayList<AndroidVersion> android_version = new ArrayList<>();
        for (int i = 0; i < android_version_names.length; i++) {
            AndroidVersion androidVersion = new AndroidVersion();
            androidVersion.setAndroid_version_name(android_version_names[i]);
            androidVersion.setAndroid_image_url(android_image_urls[i]);
            android_version.add(androidVersion);
        }
        return android_version;
    }

    @Override
    public void itemClicked(View view, int position) {
        String artistExtra = null;
        Intent intent = new Intent(new Intent(getApplicationContext(), MainActivity.class));
       // intent.putExtra(artistExtra, position);
        intent.putExtra("ITEM", position);
        startActivity(intent);

        // startActivity(new Intent(getApplicationContext(), MainActivity.class));

    }

    public String SearchView(){
        // Get the intent, verify the action and get the query
       // String queries = ;
        Intent intent = getIntent();
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
        Intent intentActivity = new Intent(new Intent(getApplicationContext(), MainActivity.class));
            intentActivity.putExtra("ITEM", query);


        }

        return SearchView();
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }


}

