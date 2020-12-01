package com.example.twitterApi.model;

import java.util.Date;

public class TwitterDetails {

    String text;
    String name;
    String screenName;
    Date createdAt;
    String profileImageUrl;

    public TwitterDetails(String text, String name, String screenName, Date createdAt, String profileImageUrl) {
        this.text = text;
        this.name = name;
        this.screenName = screenName;
        this.createdAt = createdAt;
        this.profileImageUrl = profileImageUrl;
    }

    public TwitterDetails() {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    @Override
    public String toString() {
        return "TwitterDetails{" +
                "text='" + text + '\'' +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                ", photoImageUrl='" + profileImageUrl + '\'' +
                '}';
    }
}
