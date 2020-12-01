package com.example.twitterApi.resource;

import com.example.twitterApi.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.*;


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
}