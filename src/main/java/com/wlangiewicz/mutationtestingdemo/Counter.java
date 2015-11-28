package com.wlangiewicz.mutationtestingdemo;

public class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public void increment() {
        ++count;
    }

    public void reset() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void make5Increments() {
        increment();
        increment();
        increment();
        increment();
        increment();
    }
}
