package com.prgazevedo.timbuchalka.Section9.Interfaces_Inner_Anonymous_Abstract_classes.InnerClassesChallenge;

/**
 * Reused from TimBuchalka code
 * Created by dev on 18/09/15.
 */
public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
