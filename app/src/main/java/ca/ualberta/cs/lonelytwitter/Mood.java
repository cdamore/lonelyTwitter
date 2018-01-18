package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood {
    private Date date;

    public Mood() {}

    Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getMood();
}
