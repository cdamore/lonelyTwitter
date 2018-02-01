/*
 * Normal Tweet
 *
 * January 31, 2018
 *
 * Copyright 2018 Team X...
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a normal tweet
 *
 * @author Colin D'Amore
 * @version 1.5
 * @see Tweet
 */

public class NormalTweet extends Tweet {

    /**
     * Constructs a normal tweet
     *
     * @param message normal tweet message
     */

    NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs a normal tweet with a date
     *
     * @param message normal tweet message
     * @param date normal tweet date
     */

    NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * returns true if tweet is important
     * returns false if tweet is normal
     *
     * @return returns boolean if tweet is important or not
     */

    @Override
    public boolean isImportant() {
        return false;
    }
}
