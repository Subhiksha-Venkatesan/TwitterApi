package com.example.twitterApi.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TwitterControllerTest {

    @InjectMocks
    TwitterController twitterController;

    @Mock
    Twitter twitter;

    @Test
    public void getFeedTest() throws TwitterException {
        ResponseList<Status> response = twitter.getHomeTimeline();
        when(twitter.getHomeTimeline()).thenReturn(response);
        ResponseList<Status> getTimeLineMsg =twitterController.getFeed();
        assertEquals(response,getTimeLineMsg);
    }

    @Test
    public void postTweetTest() throws TwitterException{
        Status s = null;
        when(twitter.updateStatus(anyString())).thenReturn(s);
        Status a = twitterController.postTweet("hello");
        assertEquals(s,a);
    }
}