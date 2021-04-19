/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modbikes.model;

/**
 *
 * @author Admin
 */
public class Location {

    private int LocationID;
    private String LocationName;
    private String LocationPicLink;
    private float Latitude;
    private float Londtitude;

    public Location(int LocationID, String LocationName, String LocationPicLink, float Latitude, float Londtitude) {
        this.LocationID = LocationID;
        this.LocationName = LocationName;
        this.LocationPicLink = LocationPicLink;
        this.Latitude = Latitude;
        this.Londtitude = Londtitude;
    }

    public int getLocationID() {
        return LocationID;
    }

    public void setLocationID(int LocationID) {
        this.LocationID = LocationID;
    }

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String LocationName) {
        this.LocationName = LocationName;
    }

    public String getLocationPicLink() {
        return LocationPicLink;
    }

    public void setLocationPicLink(String LocationPicLink) {
        this.LocationPicLink = LocationPicLink;
    }

    public float getLatitude() {
        return Latitude;
    }

    public void setLatitude(float Latitude) {
        this.Latitude = Latitude;
    }

    public float getLondtitude() {
        return Londtitude;
    }

    public void setLondtitude(float Londtitude) {
        this.Londtitude = Londtitude;
    }

    @Override
    public String toString() {
        return "Location{" + "LocationID=" + LocationID + ", LocationName=" + LocationName + ", LocationPicLink=" + LocationPicLink + ", Latitude=" + Latitude + ", Londtitude=" + Londtitude + '}';
    }

}
