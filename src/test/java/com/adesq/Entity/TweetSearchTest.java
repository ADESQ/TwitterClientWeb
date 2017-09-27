package com.adesq.Entity;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TweetSearchTest {
    @Test
    public void setAndGetHashTag() throws Exception {
        String a = "test";
        TweetSearch tweetSearch = new TweetSearch();
        tweetSearch.setHashTag("test");
        String value = tweetSearch.getHashTag();
        Assert.assertEquals(value, a);
    }

    @Test
    public void setAndGetNbOfTweets() throws Exception {
        Integer a = 10;
        TweetSearch tweetSearch = new TweetSearch();
        tweetSearch.setNbOfTweets(10);
        Integer value = tweetSearch.getNbOfTweets();
        Assert.assertEquals(value, a);
    }
}