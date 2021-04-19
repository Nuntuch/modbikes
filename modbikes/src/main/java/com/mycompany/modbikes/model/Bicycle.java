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
public class Bicycle {

    private int BikeID;
    private int LocationID;
    private boolean IsAvailable;
    private String Detail;
    private String BikePicLink;

    public Bicycle(int BikeID, int LocationID, boolean IsAvailable, String Detail, String BikePicLink) {
        this.BikeID = BikeID;
        this.LocationID = LocationID;
        this.IsAvailable = IsAvailable;
        this.Detail = Detail;
        this.BikePicLink = BikePicLink;
    }

    public int getBikeID() {
        return BikeID;
    }

    public void setBikeID(int BikeID) {
        this.BikeID = BikeID;
    }

    public int getLocationID() {
        return LocationID;
    }

    public void setLocationID(int LocationID) {
        this.LocationID = LocationID;
    }

    public boolean isIsAvailable() {
        return IsAvailable;
    }

    public void setIsAvailable(boolean IsAvailable) {
        this.IsAvailable = IsAvailable;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    public String getBikePicLink() {
        return BikePicLink;
    }

    public void setBikePicLink(String BikePicLink) {
        this.BikePicLink = BikePicLink;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "BikeID=" + BikeID + ", LocationID=" + LocationID + ", IsAvailable=" + IsAvailable + ", Detail=" + Detail + ", BikePicLink=" + BikePicLink + '}';
    }

}
