//Katherine Soltani (G01191765), Sharadha Shivakumar (G01390373),Swathi Dharma Sankaran(G01351215), Nikhitha Kalinga(G01382843)
//defining the column names along with the getters and setters for the same.
package com.StudentSurvey.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.UuidGenerator;
import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@Table(name="surveys")
public class Survey {
   
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @UuidGenerator
    private String surveyNum;
    private String Fname;
    private String Lname;
    private String Street;
    private String City;
    private String Statename;
    private int Zip;
    private String Telephone;
    private String Email;
    private String Dateofsurvey;
    private String students;
    private boolean locationaddr;
    private boolean campus;
    private String atmos;
    private String dorm;
    private String sport;
    private String recommend;
    private String comments;

    // getters and setters
    @JsonProperty("surveyNum")
    public String getsurveyNum() {
    	return surveyNum;
    }

    @JsonProperty("Fname")
    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    @JsonProperty("Lname")
    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    @JsonProperty("Street")
    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    @JsonProperty("City")
    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @JsonProperty("Statename")
    public String getStatename() {
        return Statename;
    }

    public void setStatename(String statename) {
        Statename = statename;
    }

    @JsonProperty("Zip")
    public int getZip() {
        return Zip;
    }

    public void setZip(int zip) {
        Zip = zip;
    }
    @JsonProperty("Telephone")
    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }
    @JsonProperty("Email")
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
    @JsonProperty("Dateofsurvey")
    public String getDateofsurvey() {
        return Dateofsurvey;
    }

    public void setDateofsurvey(String dateofsurvey) {
        Dateofsurvey = dateofsurvey;
    }
    @JsonProperty("students")
    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }
    @JsonProperty("locationaddr")
    public boolean isLocationaddr() {
        return locationaddr;
    }

    public void setLocationaddr(boolean locationaddr) {
        this.locationaddr = locationaddr;
    }
    @JsonProperty("campus")
    public boolean isCampus() {
        return campus;
    }

    public void setCampus(boolean campus) {
        this.campus = campus;
    }
    @JsonProperty("atmos")
    public String getAtmos() {
        return atmos;
    }

    public void setAtmos(String atmos) {
        this.atmos = atmos;
    }
    @JsonProperty("dorm")
    public String getDorm() {
        return dorm;
    }

    public void setDorm(String dorm) {
        this.dorm = dorm;
    }
    @JsonProperty("sport")
    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
    @JsonProperty("recommend")
    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }
    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

   

}