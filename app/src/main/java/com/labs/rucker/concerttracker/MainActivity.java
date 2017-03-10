package com.labs.rucker.concerttracker;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.labs.rucker.concerttracker.PojoBands.PojoBand;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity implements DataAdapterView.ClickListener {

    private RecyclerView recyclerView;
    private List<PojoBand> data;
    private DataAdapter adapter;
    private String artist;
    private int newString;
    private String searchString;
    String url = "http://api.bandsintown.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        ////////GRIDVIEW INTENT HANDLER OF INT TYPE///////////////
         */
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                //newString= null;
            } else {

                newString = extras
                        .getInt("ITEM");

            }
        } else {
           // newString = (int) savedInstanceState.getSerializable("ITEM");
        }


        initViews();
    }

    private void initViews() {
        recyclerView = (RecyclerView) findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        getReport();

    }

    void getReport() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RestApi service = retrofit.create(RestApi.class);

        /*ON CLICK SELECTION
        //
        //
        //
         */
        switch (newString) {
            case 0:
                artist = "Skrillex";
                break;
            case 1:
                artist = "beyonce";
                break;
            case 2:
                artist = "adele";
                break;
            case 3:
                artist = "Barbra Streisand";
                break;
            case 4:
                artist = "Billy Joel";
                break;
            case 5:
                artist = "Black Sabbath";
                break;
            case 6:
                artist = "Blink 182";
                break;
            case 7:
                artist = "Bonnie Raitt";
                break;
            case 8:
                artist = "Brantley Gilbert";
                break;
            case 9:
                artist = "Britney Spears";
                break;
            case 10:
                artist = "Bruce Springsteen";
                break;
            case 11:
                artist = "Carrie Underwood";
                break;
            case 12:
                artist = "Chris Botti";
                break;
            case 13:
                artist = "Coldplay";
                break;
            case 14:
                artist = "The Cure";
                break;
            case 15:
                artist = "Dave Matthews Band";
                break;
            case 16:
                artist = "Demi Lovato";
                break;
            case 17:
                artist = "Dixie Chicks";
                break;
            case 18:
                artist = "Drake";
                break;
            case 19:
                artist = "Ellie Goulding";
                break;
            case 20:
                artist = "Elton John";
                break;
            case 21:
                artist = "Guns N Roses";
                break;
            case 22:
                artist = "Gwen Stefani";
                break;
            case 23:
                artist = "Jason Aldean";
                break;
            case 24:
                artist = "Justin Bieber";
                break;
            case 25:
                artist = "Kanye West";
                break;
            case 26:
                artist = "Kenny Chesney";
                break;
            case 27:
                artist = "Luke Bryan";
                break;
            case 28:
                artist = "The Lumineers";
                break;
            case 29:
                artist = "Maroon 5";
                break;
            case 30:
                artist = "Paul McCartney";
                break;
            case 31:
                artist = "Pearl Jam";
                break;
            case 32:
                artist = "Prophets of Rage";
                break;
            case 33:
                artist = "Selena Gomez";
                break;
            case 34:
                artist = "Twenty One Pilots";
                break;
            case 35:
                artist = "Weezer";
                break;
            case 36:
                artist = "Willie Nelson";
                break;
            case 37:
                artist = "Zac Brown Band";
                break;

        }

        while (searchString != null){
            artist = searchString;

        }





        try {

            String encodedurl = URLEncoder.encode(artist, "UTF-8")
                    .replace("+", "%20")
                    .replace("-", "%20");
            Log.d("TEST", encodedurl);
            Call<List<PojoBand>> call = service.getJSON(encodedurl);

            call.enqueue(new Callback<List<PojoBand>>() {
                @Override
                public void onResponse(Response<List<PojoBand>> response, Retrofit retrofit) {

                    try {

                        List<PojoBand> artistData = response.body();

                        data = new List<PojoBand>() {
                            @Override
                            public void add(int location, PojoBand object) {

                            }

                            @Override
                            public boolean add(PojoBand object) {
                                return false;
                            }

                            @Override
                            public boolean addAll(int location, Collection<? extends PojoBand> collection) {
                                return false;
                            }

                            @Override
                            public boolean addAll(Collection<? extends PojoBand> collection) {
                                return false;
                            }

                            @Override
                            public void clear() {

                            }

                            @Override
                            public boolean contains(Object object) {
                                return false;
                            }

                            @Override
                            public boolean containsAll(Collection<?> collection) {
                                return false;
                            }

                            @Override
                            public PojoBand get(int location) {
                                return null;
                            }

                            @Override
                            public int indexOf(Object object) {
                                return 0;
                            }

                            @Override
                            public boolean isEmpty() {
                                return false;
                            }

                            @NonNull
                            @Override
                            public Iterator<PojoBand> iterator() {
                                return null;
                            }

                            @Override
                            public int lastIndexOf(Object object) {
                                return 0;
                            }

                            @Override
                            public ListIterator<PojoBand> listIterator() {
                                return null;
                            }

                            @NonNull
                            @Override
                            public ListIterator<PojoBand> listIterator(int location) {
                                return null;
                            }

                            @Override
                            public PojoBand remove(int location) {
                                return null;
                            }

                            @Override
                            public boolean remove(Object object) {
                                return false;
                            }

                            @Override
                            public boolean removeAll(Collection<?> collection) {
                                return false;
                            }

                            @Override
                            public boolean retainAll(Collection<?> collection) {
                                return false;
                            }

                            @Override
                            public PojoBand set(int location, PojoBand object) {
                                return null;
                            }

                            @Override
                            public int size() {
                                return 0;
                            }

                            @NonNull
                            @Override
                            public List<PojoBand> subList(int start, int end) {
                                return null;
                            }

                            @NonNull
                            @Override
                            public Object[] toArray() {
                                return new Object[0];
                            }

                            @NonNull
                            @Override
                            public <T> T[] toArray(T[] array) {
                                return null;
                            }
                        };
                        adapter = new DataAdapter(artistData);

                        recyclerView.setAdapter(adapter);


                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }


                @Override
                public void onFailure(Throwable t) {

                }
            });
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void itemClicked(View view, int position) {

    }


}
