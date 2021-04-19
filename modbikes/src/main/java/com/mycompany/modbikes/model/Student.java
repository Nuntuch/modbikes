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
public class Student {

    private long StudentID;
    private String FirstName;
    private String LastName;
    private String Faculty;
    private String Department;
    private String Password;
    private boolean IsUseBike;
    private String TelephoneNo;
    private String Email;
    private String OtherContact;

    public Student(long StudentID, String FirstName, String LastName, String Faculty, String Department, String Password, boolean IsUseBike, String TelephoneNo, String Email, String OtherContact) {
        this.StudentID = StudentID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Faculty = Faculty;
        this.Department = Department;
        this.Password = Password;
        this.IsUseBike = IsUseBike;
        this.TelephoneNo = TelephoneNo;
        this.Email = Email;
        this.OtherContact = OtherContact;
    }

    public long getStudentID() {
        return StudentID;
    }

    public void setStudentID(long StudentID) {
        this.StudentID = StudentID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String Faculty) {
        this.Faculty = Faculty;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean isIsUseBike() {
        return IsUseBike;
    }

    public void setIsUseBike(boolean IsUseBike) {
        this.IsUseBike = IsUseBike;
    }

    public String getTelephoneNo() {
        return TelephoneNo;
    }

    public void setTelephoneNo(String TelephoneNo) {
        this.TelephoneNo = TelephoneNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getOtherContact() {
        return OtherContact;
    }

    public void setOtherContact(String OtherContact) {
        this.OtherContact = OtherContact;
    }

    @Override
    public String toString() {
        return "Student{" + "StudentID=" + StudentID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Faculty=" + Faculty + ", Department=" + Department + ", Password=" + Password + ", IsUseBike=" + IsUseBike + ", TelephoneNo=" + TelephoneNo + ", Email=" + Email + ", OtherContact=" + OtherContact + '}';
    }

}
