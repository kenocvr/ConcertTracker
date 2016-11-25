package com.labs.rucker.concerttracker.PojoBands;

/**
 * Created by Carlos on 7/1/2016.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

////http://api.bandsintown.com/artists/Skrillex.json?api_version=2.0&app_id=RUCKERLABS////

@Generated("org.jsonschema2pojo")
public class PojoArtistBio {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("thumb_url")
    @Expose
    private String thumbUrl;
    @SerializedName("facebook_tour_dates_url")
    @Expose
    private Object facebookTourDatesUrl;
    @SerializedName("facebook_page_url")
    @Expose
    private Object facebookPageUrl;
    @SerializedName("mbid")
    @Expose
    private String mbid;
    @SerializedName("tracker_count")
    @Expose
    private Integer trackerCount;
    @SerializedName("upcoming_event_count")
    @Expose
    private Integer upcomingEventCount;

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     *
     * @param imageUrl
     * The image_url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     *
     * @return
     * The thumbUrl
     */
    public String getThumbUrl() {
        return thumbUrl;
    }

    /**
     *
     * @param thumbUrl
     * The thumb_url
     */
    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    /**
     *
     * @return
     * The facebookTourDatesUrl
     */
    public Object getFacebookTourDatesUrl() {
        return facebookTourDatesUrl;
    }

    /**
     *
     * @param facebookTourDatesUrl
     * The facebook_tour_dates_url
     */
    public void setFacebookTourDatesUrl(Object facebookTourDatesUrl) {
        this.facebookTourDatesUrl = facebookTourDatesUrl;
    }

    /**
     *
     * @return
     * The facebookPageUrl
     */
    public Object getFacebookPageUrl() {
        return facebookPageUrl;
    }

    /**
     *
     * @param facebookPageUrl
     * The facebook_page_url
     */
    public void setFacebookPageUrl(Object facebookPageUrl) {
        this.facebookPageUrl = facebookPageUrl;
    }

    /**
     *
     * @return
     * The mbid
     */
    public String getMbid() {
        return mbid;
    }

    /**
     *
     * @param mbid
     * The mbid
     */
    public void setMbid(String mbid) {
        this.mbid = mbid;
    }

    /**
     *
     * @return
     * The trackerCount
     */
    public Integer getTrackerCount() {
        return trackerCount;
    }

    /**
     *
     * @param trackerCount
     * The tracker_count
     */
    public void setTrackerCount(Integer trackerCount) {
        this.trackerCount = trackerCount;
    }

    /**
     *
     * @return
     * The upcomingEventCount
     */
    public Integer getUpcomingEventCount() {
        return upcomingEventCount;
    }

    /**
     *
     * @param upcomingEventCount
     * The upcoming_event_count
     */
    public void setUpcomingEventCount(Integer upcomingEventCount) {
        this.upcomingEventCount = upcomingEventCount;
    }

}