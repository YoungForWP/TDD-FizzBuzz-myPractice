package com.tw;

public class BuzzMatcher {
    public BuzzMatcher() {
    }

    boolean isMatchedBuzz(int number) {
        return number % 5 == 0;
    }

    String getText() {
        return "Buzz";
    }
}