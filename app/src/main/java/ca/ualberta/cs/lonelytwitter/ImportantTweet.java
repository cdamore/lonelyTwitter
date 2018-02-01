/*
 * Important Tweet
 *
 * January 31, 2018
 *
 * Copyright 2018 Team X...
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents an important tweet
 *
 * @author Colin D'Amore
 * @version 1.5
 * @see Tweet
 */

public class ImportantTweet extends Tweet {

    /**
     * Constructs an important tweet
     *
     * @param message important tweet message
     */

    ImportantTweet(String message) {
        super(message);
    }

    /**
     * Constructs an important tweet with a date
     *
     * @param message important tweet message
     * @param date important tweet date
     */

    ImportantTweet(String message, Date date) {
       super(message, date);
    }

    /**
     * Gets the important tweet message
     *
     * @return returns important tweet message
     */

    public String getMessage() {
        return "hi";
    }

    /**
     * returns true if tweet is important
     * returns false if tweet is normal
     *
     * @return returns boolean if tweet is important or not
     */

    @Override
    public boolean isImportant() {
        return true;
    }
}
