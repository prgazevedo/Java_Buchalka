package com.Section8.Arrays_Lists_Autoboxing.LinkedListChallenge;

import java.util.Objects;
import java.util.Random;

public class Song {
    String title;
    Double duration;


    public Song(String title) {
        this.title = title;
        Random r = new Random();
        this.duration = (5.0) * r.nextDouble();
    }

    public Song(String title, Double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(title, song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + String.format("%.1f", duration) +
                '}';
    }
}
