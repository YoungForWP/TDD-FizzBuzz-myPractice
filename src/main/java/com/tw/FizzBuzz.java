package com.tw;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    private final BuzzMatcher buzzMatcher = new BuzzMatcher();
    private final FizzMatcher fizzMatcher = new FizzMatcher();
    private final FizzBuzzMatcher fizzBuzzMatcher = new FizzBuzzMatcher(fizzMatcher, buzzMatcher);
    private List<Matcher> matchers = Arrays.asList(fizzBuzzMatcher, buzzMatcher, fizzMatcher);

    public FizzBuzz() {
    }

    public String count(int number) {
        for (Matcher matcher : matchers) {
            if (matcher.isMatched(number)) {
                return matcher.getText();
            }
        }
        return String.valueOf(number);
    }
}