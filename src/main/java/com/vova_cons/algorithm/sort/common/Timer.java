package com.vova_cons.algorithm.sort.common;

public class Timer {
    long startTime = System.currentTimeMillis();
    double elapsed = 0;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public double getElapsed() {
        return elapsed;
    }

    public double stop() {
        long current = System.currentTimeMillis();
        elapsed = ((double)(current - startTime))/1000.0;
        startTime = current;
        return elapsed;
    }
}
