package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by colin on 2018-02-14.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet) {
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public int getCount() {
        return tweets.size();
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }
}
