package com.example.twitterApi.dao;

import com.example.twitterApi.model.TwitterDetails;
import twitter4j.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TwitterDao {

    Twitter twitter = TwitterFactory.getSingleton();

    List<TwitterDetails> a = new ArrayList<>();

    public ResponseList<Status> gettingFeed() throws TwitterException {
        return twitter.getHomeTimeline();
    }

    public Status postingTweet(String hello) throws TwitterException {
        return twitter.updateStatus(hello);
    }

    public HashMap<String,TwitterDetails> postingMsg(List<TwitterDetails> data) throws TwitterException {

       //List<TwitterDetails> info = data.stream().sorted(Comparator.comparing(TwitterDetails::getName)).collect(Collectors.toList());
        HashMap<String,TwitterDetails> userList = new HashMap<>();
        List<String> userNames = data.stream().map(item -> {
            userList.put(item.getName(),item);
            return item.getName();
        }).collect(Collectors.toList());
        return userList;
    }
}

