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
public class History {

    private int HistoryID;
    private long StudentID;
    private long BikeID;
    private String StartDate;
    private String FinishedDate;
    private String LastLocation;
    private boolean IsReturnBikeOntime;

    public History(int HistoryID, long StudentID, long BikeID, String StartDate, String FinishedDate, String LastLocation, boolean IsReturnBikeOntime) {
        this.HistoryID = HistoryID;
        this.StudentID = StudentID;
        this.BikeID = BikeID;
        this.StartDate = StartDate;
        this.FinishedDate = FinishedDate;
        this.LastLocation = LastLocation;
        this.IsReturnBikeOntime = IsReturnBikeOntime;
    }

    public int getHistoryID() {
        return HistoryID;
    }

    public void setHistoryID(int HistoryID) {
        this.HistoryID = HistoryID;
    }

    public long getStudentID() {
        return StudentID;
    }

    public void setStudentID(long StudentID) {
        this.StudentID = StudentID;
    }

    public long getBikeID() {
        return BikeID;
    }

    public void setBikeID(long BikeID) {
        this.BikeID = BikeID;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getFinishedDate() {
        return FinishedDate;
    }

    public void setFinishedDate(String FinishedDate) {
        this.FinishedDate = FinishedDate;
    }

    public String getLastLocation() {
        return LastLocation;
    }

    public void setLastLocation(String LastLocation) {
        this.LastLocation = LastLocation;
    }

    public boolean isIsReturnBikeOntime() {
        return IsReturnBikeOntime;
    }

    public void setIsReturnBikeOntime(boolean IsReturnBikeOntime) {
        this.IsReturnBikeOntime = IsReturnBikeOntime;
    }

    @Override
    public String toString() {
        return "History{" + "HistoryID=" + HistoryID + ", StudentID=" + StudentID + ", BikeID=" + BikeID + ", StartDate=" + StartDate + ", FinishedDate=" + FinishedDate + ", LastLocation=" + LastLocation + ", IsReturnBikeOntime=" + IsReturnBikeOntime + '}';
    }

}
