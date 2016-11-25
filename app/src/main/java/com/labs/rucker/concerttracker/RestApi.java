package com.labs.rucker.concerttracker;

import com.labs.rucker.concerttracker.PojoBands.PojoBand;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by androidwarriors on 12/3/2015.
 */
public interface RestApi {


/*
SHOWS NEAR ME GEO_IP
http://api.bandsintown.com/artists/{artist}/events/search.json?api_version=2.0&app_id=RUCKERLABS&location=use_geoip&radius=150
 */

    @GET("/artists/{artist}/events/search.json?api_version=2.0&app_id=RUCKERLABS&location=use_geoip&radius=150")
    Call<List<PojoBand>> getJSON(@Path(value = "artist", encoded = true) String artist);

}
