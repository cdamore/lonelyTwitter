package ca.ualberta.cs.lonelytwitter;

public interface Tweetable {
    public String getMessage();
    public void setMessage(String message) throws TweetTooLongException;
}
