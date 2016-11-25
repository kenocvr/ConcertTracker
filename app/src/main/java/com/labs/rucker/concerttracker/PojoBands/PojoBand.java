
package com.labs.rucker.concerttracker.PojoBands;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class PojoBand {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("formatted_datetime")
    @Expose
    private String formattedDatetime;
    @SerializedName("formatted_location")
    @Expose
    private String formattedLocation;
    @SerializedName("ticket_url")
    @Expose
    private String ticketUrl;
    @SerializedName("ticket_type")
    @Expose
    private String ticketType;
    @SerializedName("ticket_status")
    @Expose
    private String ticketStatus;
    @SerializedName("on_sale_datetime")
    @Expose
    private Object onSaleDatetime;
    @SerializedName("facebook_rsvp_url")
    @Expose
    private String facebookRsvpUrl;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("artists")
    @Expose
    private List<Artist> artists = new ArrayList<Artist>();
    @SerializedName("venue")
    @Expose
    private Venue venue;

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The datetime
     */
    public String getDatetime() {
        return datetime;
    }

    /**
     * 
     * @param datetime
     *     The datetime
     */
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    /**
     * 
     * @return
     *     The formattedDatetime
     */
    public String getFormattedDatetime() {
        return formattedDatetime;
    }

    /**
     * 
     * @param formattedDatetime
     *     The formatted_datetime
     */
    public void setFormattedDatetime(String formattedDatetime) {
        this.formattedDatetime = formattedDatetime;
    }

    /**
     * 
     * @return
     *     The formattedLocation
     */
    public String getFormattedLocation() {
        return formattedLocation;
    }

    /**
     * 
     * @param formattedLocation
     *     The formatted_location
     */
    public void setFormattedLocation(String formattedLocation) {
        this.formattedLocation = formattedLocation;
    }

    /**
     * 
     * @return
     *     The ticketUrl
     */
    public String getTicketUrl() {
        return ticketUrl;
    }

    /**
     * 
     * @param ticketUrl
     *     The ticket_url
     */
    public void setTicketUrl(String ticketUrl) {
        this.ticketUrl = ticketUrl;
    }

    /**
     * 
     * @return
     *     The ticketType
     */
    public String getTicketType() {
        return ticketType;
    }

    /**
     * 
     * @param ticketType
     *     The ticket_type
     */
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    /**
     * 
     * @return
     *     The ticketStatus
     */
    public String getTicketStatus() {
        return ticketStatus;
    }

    /**
     * 
     * @param ticketStatus
     *     The ticket_status
     */
    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    /**
     * 
     * @return
     *     The onSaleDatetime
     */
    public Object getOnSaleDatetime() {
        return onSaleDatetime;
    }

    /**
     * 
     * @param onSaleDatetime
     *     The on_sale_datetime
     */
    public void setOnSaleDatetime(Object onSaleDatetime) {
        this.onSaleDatetime = onSaleDatetime;
    }

    /**
     * 
     * @return
     *     The facebookRsvpUrl
     */
    public String getFacebookRsvpUrl() {
        return facebookRsvpUrl;
    }

    /**
     * 
     * @param facebookRsvpUrl
     *     The facebook_rsvp_url
     */
    public void setFacebookRsvpUrl(String facebookRsvpUrl) {
        this.facebookRsvpUrl = facebookRsvpUrl;
    }

    /**
     * 
     * @return
     *     The description
     */
    public Object getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(Object description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The artists
     */
    public List<Artist> getArtists() {
        return artists;
    }

    /**
     * 
     * @param artists
     *     The artists
     */
    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    /**
     * 
     * @return
     *     The venue
     */
    public Venue getVenue() {
        return venue;
    }

    /**
     * 
     * @param venue
     *     The venue
     */
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

}
