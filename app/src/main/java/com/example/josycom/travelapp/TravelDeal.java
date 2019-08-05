package com.example.josycom.travelapp;

import java.io.Serializable;

public class TravelDeal implements Serializable {
    private String id;
    private String title;
    private String description;
    private String price;
    private String imageUrl;
    private String imageName;

    /* ***** Creates an instance of the TravelDeal class **** */
    public TravelDeal() {
    }

    /**
     * Constructor containing details of the travel deals
     *
     * @param title       of the trip
     * @param description of the trip
     * @param price       of the trip
     * @param imageUrl    of the trip
     */
    public TravelDeal(String title, String description, String price, String imageUrl, String imageName) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.imageName = imageName;
    }

    /* ***** Gets the trip ID **** */
    public String getId() {
        return id;
    }

    /**
     * Sets the trip id
     *
     * @param id of the trip
     */
    public void setId(String id) {
        this.id = id;
    }

    /* ***** Gets the trip's title **** */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the title of the trip
     *
     * @param title of the trip
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /* ***** Gets the trip's description **** */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the trip's description
     *
     * @param description of the trip
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /* ***** Gets the trip's price **** */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the trip's price
     *
     * @param price of the trip
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /* ***** Gets the trip's image **** */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the trips image
     *
     * @param imageUrl of the trip
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
