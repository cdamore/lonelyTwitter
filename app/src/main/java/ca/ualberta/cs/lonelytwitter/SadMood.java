package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class SadMood extends Mood {
    SadMood(Date date) {
        super(date);
    }

    @Override
    public String getMood() {
        return "sad";
    }
}