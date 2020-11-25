package com.example.twitterApi.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.*;


@RestController
@RequestMapping("/tweet")
public class TwitterController {

    Twitter twitter = TwitterFactory.getSingleton();

    static Logger log = Logger.getLogger(TwitterController.class.getName());

    @RequestMapping(value = "/getTweets", method = RequestMethod.GET)
    public ResponseList<Status> getFeed() throws TwitterException {
        log.info("Getting timeline");
        return twitter.getHomeTimeline();
    }

    @RequestMapping(value = "/postTweets", method = RequestMethod.POST)
    public Status postTweet(String hello) throws TwitterException {
        log.info("posting tweet");
        return twitter.updateStatus(hello);
//        return "Tweet posted";
    }
}