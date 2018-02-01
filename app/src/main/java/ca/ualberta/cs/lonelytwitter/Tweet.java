/*
 * Tweet
 *
 * January 31, 2018
 *
 * Copyright 2018 Team X...
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author Colin D'Amore
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    private ArrayList<Mood> allmoods = new ArrayList<Mood>();

    /**
     * Constructs a tweet message without a date
     *
     * @param message tweet message
     */
    Tweet(String message) {
        this.message = message;
    }

    /**
     * Constructs a tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * Getter for date of the tweet
     *
     * @return returns the date of the tweet
     */

    public Date getDate() {
        return date;
    }

    /**
     * Getter for message of the tweet
     *
     * @return returns message of the tweet
     */

    public String getMessage() {
        return message;
    }

    /**
     * Sets tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException thrown if tweet exceeds 140 characters
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 160) {
            // throw an error
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    /**
     * Sets the date
     *
     * @param date tweet date
     */

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * returns true if tweet is important
     * returns false if tweet is normal
     *
     * @return returns boolean if tweet is important or not
     */
    public abstract boolean isImportant();

    /**
     * returns String of tweet message
     *
     * @return returns message of string
     */
    @Override
    public String toString() {
       return message;
    }

}
