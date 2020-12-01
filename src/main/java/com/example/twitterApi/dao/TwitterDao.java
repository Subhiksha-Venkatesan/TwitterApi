package com.example.twitterApi.dao;

import com.example.twitterApi.model.TwitterDetails;
import twitter4j.*;

import java.util.ArrayList;
import java.util.List;

public class TwitterDao {

    Twitter twitter = TwitterFactory.getSingleton();

    public ResponseList<Status> gettingFeed() throws TwitterException {
        return twitter.getHomeTimeline();
    }

    public Status postingTweet(String hello) throws TwitterException {
        return twitter.updateStatus(hello);
    }

    public List<TwitterDetails> gettingInfo() throws TwitterException {

        List<TwitterDetails> getInfo = new ArrayList<>();
        List<Status> getTimeLine = twitter.getHomeTimeline();

        for(Status sa : getTimeLine)
        {
            TwitterDetails twitterDetails = new TwitterDetails();
            twitterDetails.setText(sa.getText());
            twitterDetails.setCreatedAt(sa.getCreatedAt());
            twitterDetails.setProfileImageUrl(sa.getUser().getProfileImageURL());
            twitterDetails.setName(sa.getUser().getName());
            twitterDetails.setScreenName(sa.getUser().getScreenName());
            getInfo.add(twitterDetails);

        }
        return getInfo;
    }
}

