package com.example.twitterApi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.*;


@RestController
@RequestMapping("/tweet")
public class TwitterController {

    Twitter twitter = TwitterFactory.getSingleton();

    @RequestMapping(value = "/getTweets", method = RequestMethod.GET)
    public ResponseList<Status> getFeed() throws TwitterException {
        return twitter.getHomeTimeline();
    }

    @RequestMapping(value = "/postTweets", method = RequestMethod.POST)
    public Status postTweet(String hello) throws TwitterException {
        return twitter.updateStatus(hello);
//        return "Tweet posted";
    }
}