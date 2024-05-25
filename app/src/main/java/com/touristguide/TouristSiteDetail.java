package com.touristguide;

public class TouristSiteDetail {
     String name;
     String description;
     int imageResourceId;
     String address,category;
     double latitude;
     double longitude;
     String websiteUrl;
     double rating;
    public TouristSiteDetail(String name, String description, int imageResourceId,String category, String address, double latitude, double longitude,String websiteUrl,double rating) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.category = category;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.websiteUrl = websiteUrl;
        this.rating = rating;
    }
}
