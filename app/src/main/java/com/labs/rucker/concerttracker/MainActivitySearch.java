package com.labs.rucker.concerttracker;

/**
 * Created by Carlos on 7/18/2016.
 */

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

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

//import RuckerLabs.ConcertTracker.PojoBands.PojoBand;


public class MainActivitySearch extends AppCompatActivity implements DataAdapterView.ClickListener {

    ErrorHandler errorHandler;
    private RecyclerView recyclerView;
    //private List<BandSelection> dataBand;
    private List<PojoBand> data;
    private DataAdapter adapter;
    private String artist;
    private int newString;
    private String searchString;
    String url = "http://api.bandsintown.com";
    TextView txt_city, txt_status, txt_humidity, txt_pressure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        //////SEARCHVIEW INTENT HANDLER OF STRING TYPE/////////////////////
         */
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                //newString= null;

            } else {

                searchString = extras
                        .getString("ITEM");

            }
        } else {
            searchString = (String) savedInstanceState.getSerializable("ITEM");
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







        try {

            String encodedurl = URLEncoder.encode(searchString, "UTF-8")
                    .replace("+", "%20")
                    .replace("-", "%20");
            Log.d("TEST", encodedurl);
            Call<List<PojoBand>> call = service.getJSON(encodedurl);

            call.enqueue(new Callback<List<PojoBand>>() {
                @Override
                public void onResponse(Response<List<PojoBand>> response, Retrofit retrofit) {

                    try {

                        List<PojoBand> StudentData = response.body();
                        List<PojoBand> jsonResponse = response.body();

                        //data = new StudentData;
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
                        // Object[] datas = StudentData.toArray();
                        adapter = new DataAdapter(StudentData);

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

