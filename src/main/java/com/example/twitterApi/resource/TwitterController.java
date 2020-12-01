package com.example.twitterApi.resource;

import com.example.twitterApi.model.TwitterDetails;
import com.example.twitterApi.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;
import twitter4j.*;

import java.util.HashMap;
import java.util.List;


@RestController
@RequestMapping("/tweet")
public class TwitterController {

    @Autowired
    private TwitterService twitterService;

    @RequestMapping(value = "/getTweets", method = RequestMethod.GET)
    public ResponseList<Status> getFeed() throws TwitterException {
        return twitterService.gettingFeed();
    }

    @RequestMapping(value = "/postTweets", method = RequestMethod.POST)
    public Status postTweet(String msg) throws TwitterException {
        return twitterService.postingTweet(msg);
    }

    @RequestMapping(value = "/posting", method = RequestMethod.POST)
    public HashMap<String,TwitterDetails> postingMsg(@RequestBody List<TwitterDetails> data) throws TwitterException {
        return twitterService.postingMsg(data);
    }

}