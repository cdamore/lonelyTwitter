package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    private ArrayList<Mood> allmoods = new ArrayList<Mood>();

    public Tweet() {
    }

    Tweet(String message) {
        this.message = message;
    }

    Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 160) {
            // throw an error
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract boolean isImportant();

    public void setMood(Mood mood) {
        allmoods.add(mood);
    }

    public ArrayList<Mood> getMoods() {
        return allmoods;
    }

}
