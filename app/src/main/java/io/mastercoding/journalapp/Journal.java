package io.mastercoding.journalapp;

import com.google.firebase.Timestamp;

public class Journal {

    private String title;
    private String imageUrl;
    private String thoughts;
    private String userID;
    private String userName;
    private Timestamp timeAdded;

    public Journal() {
    }

    public Journal(String title, String imageUrl, String thoughts, String userID, String userName, Timestamp timeAdded) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.thoughts = thoughts;
        this.userID = userID;
        this.userName = userName;
        this.timeAdded = timeAdded;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getTimeAdded() {
        return timeAdded;
    }

    public void setTimeAdded(Timestamp timeAdded) {
        this.timeAdded = timeAdded;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getThoughts() {
        return thoughts;
    }

    public void setThoughts(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
