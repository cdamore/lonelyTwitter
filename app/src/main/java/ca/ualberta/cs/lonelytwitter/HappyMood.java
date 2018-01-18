package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class HappyMood extends Mood {
    HappyMood(Date date) {
        super(date);
    }

    @Override
    public String getMood() {
        return "happy";
    }
}
