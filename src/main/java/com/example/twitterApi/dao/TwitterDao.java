package com.example.twitterApi.dao;

import twitter4j.*;

public class TwitterDao {

    Twitter twitter = TwitterFactory.getSingleton();

    public ResponseList<Status> gettingFeed() throws TwitterException {
        return twitter.getHomeTimeline();
    }

    public Status postingTweet(String hello) throws TwitterException {
        return twitter.updateStatus(hello);
    }
}
