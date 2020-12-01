package com.example.twitterApi.service;

import com.example.twitterApi.dao.TwitterDao;
import com.example.twitterApi.model.TwitterDetails;
import org.springframework.stereotype.Service;
import twitter4j.*;

import java.util.HashMap;
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

    public HashMap<String,TwitterDetails> postingMsg(List<TwitterDetails> data) throws TwitterException{
        return twitterDao.postingMsg(data);
    }
}
