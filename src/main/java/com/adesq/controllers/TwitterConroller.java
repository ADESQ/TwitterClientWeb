package com.adesq.controllers;

import com.adesq.Entity.TweetSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TwitterConroller {

    @Autowired
    private Twitter twitter;

    @GetMapping("/tweet")
    public String twitterForm(Model model) {
        model.addAttribute("tweetSearch", new TweetSearch());
        return "tweetSearch";
    }

    @PostMapping("/tweet")
    public String getTweets(@ModelAttribute TweetSearch tweetSearch, Model model) {
        List<Tweet> tweets = twitter.searchOperations().search(tweetSearch.getHashTag(), tweetSearch.getNbOfTweets()).getTweets();
        model.addAttribute("tweets", tweets);
        return "tweets";
    }
}
