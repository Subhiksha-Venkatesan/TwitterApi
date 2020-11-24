package com.example.twitterApi.service;

import com.example.twitterApi.dao.TwitterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.*;

@Service
public class TwitterService {

    TwitterDao twitterDao =  new TwitterDao();

    public ResponseList<Status> gettingFeed() throws TwitterException {
        return twitterDao.gettingFeed();
    }

    public Status postingTweet(String msg) throws TwitterException {
        return twitterDao.postingTweet(msg);
    }
}
