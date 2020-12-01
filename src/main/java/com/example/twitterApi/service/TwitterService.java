package com.example.twitterApi.service;

import com.example.twitterApi.dao.TwitterDao;
import com.example.twitterApi.model.TwitterDetails;
import org.springframework.stereotype.Service;
import twitter4j.*;

import java.util.List;

@Service
public class TwitterService {

    TwitterDao twitterDao =  new TwitterDao();

    public ResponseList<Status> gettingFeed() throws TwitterException {
        return twitterDao.gettingFeed();
    }

    public Status postingTweet(String msg) throws TwitterException {
        return twitterDao.postingTweet(msg);
    }

    public List<TwitterDetails> gettingInfo() throws TwitterException{
        return twitterDao.gettingInfo();
    }
}
