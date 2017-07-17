package com.tw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FizzBuzz {
    private final Matcher buzzMatcher = Matcher.buzz();
    private final Matcher fizzMatcher = Matcher.fizz();
    private final Matcher whizzMatcher = Matcher.whizz();
    private List<Matcher> matchers = Arrays.asList(buzzMatcher, fizzMatcher, whizzMatcher);

    public FizzBuzz() {
        Collections.sort(matchers);
    }

    public String count(int number) {
        StringBuilder result = new StringBuilder();
        for (Matcher matcher : matchers) {
            if (matcher.isMatched(number)) {
                result.append(matcher.getText());
            }
        }
        return (result.length() == 0) ? String.valueOf(number) : result.toString();
    }

}