package com.tw;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzMatcher implements Matcher {


    private final List<Matcher> matchers;

    public FizzBuzzMatcher(Matcher... matchers) {
        this.matchers = Arrays.asList(matchers);
    }

    @Override
    public boolean isMatched(int number) {
        for (Matcher matcher : matchers) {
            if (matchers.isEmpty()) {
                return false;
            }
            if (!matcher.isMatched(number)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getText() {
        return "FizzBuzz";
    }
}