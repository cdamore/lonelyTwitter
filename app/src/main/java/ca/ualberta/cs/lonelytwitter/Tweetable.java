/*
 * Tweetable
 *
 * January 31, 2018
 *
 * Copyright 2018 Team X...
 */

package ca.ualberta.cs.lonelytwitter;

public interface Tweetable {

    public String getMessage();

    public void setMessage(String message) throws TweetTooLongException;
}
