package com.tw;

public class WhizzMatcher implements Matcher {
    public WhizzMatcher() {
    }

    @Override
    public String getText() {
        return "Whizz";
    }

    @Override
    public int priority() {
        return 3;
    }

    @Override
    public boolean isMatched(int number) {
        return number % 7 == 0;
    }
}