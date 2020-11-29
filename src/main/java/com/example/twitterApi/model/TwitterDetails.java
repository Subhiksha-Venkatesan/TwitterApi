package com.example.twitterApi.model;

import java.util.Date;

public class TwitterDetails {

    String name;
    String email;
    String tweet;

    public TwitterDetails() {

    }
    public TwitterDetails(String name, String email, String tweet) {
        this.name = name;
        this.email = email;
        this.tweet = tweet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    @Override
    public String toString() {
        return "TwitterDetails{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", tweet='" + tweet + '\'' +
                '}';
    }
}
