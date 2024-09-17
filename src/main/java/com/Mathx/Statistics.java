package com.Mathx;

public class Statistics {
    private double media;
    private double median;
    private double mode;

    public Statistics() {
        this.media = 0.0;
        this.median = 0.0;
        this.mode = 0.0;
    }

    public Statistics(double media, double median, double mode) {
        this.media = media;
        this.median = median;
        this.mode = mode;
    }

    public double getMedia() {
        return media;
    }

    public double getMedian() {
        return median;
    }

    public double getMode() {
        return mode;
    }

    @Override
    public String toString() {
        return String.format("[media: %.2f, median: %.2f, mode: %.2f]", getMedia(), getMedian(),getMode());
    }
}
