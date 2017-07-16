package com.tw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FizzBuzz {
    private final BuzzMatcher buzzMatcher = new BuzzMatcher();
    private final FizzMatcher fizzMatcher = new FizzMatcher();
    private List<Matcher> matchers = Arrays.asList(buzzMatcher, fizzMatcher);

    public FizzBuzz() {
        Collections.sort(matchers);
    }

    public String count(int number) {
        String result = "";
        for (Matcher matcher : matchers) {
            if (matcher.isMatched(number)) {
                result += matcher.getText();
            }
        }
        return result.isEmpty() ? String.valueOf(number) : result;
    }
}