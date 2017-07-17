package com.tw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FizzBuzz {
    private final Matcher buzzMatcher = Matcher.buzz();
    private final Matcher fizzMatcher = Matcher.fizz();
    private final Matcher whizzMatcher = Matcher.whizz();
    private final DigitMatcher digitFizzMatcher = DigitMatcher.fizz();
    private final DigitMatcher digitBuzzMatcher = DigitMatcher.buzz();
    private final DigitMatcher digitWhizzMatcher = DigitMatcher.whizz();
    private final List<DigitMatcher> digitMatchers = Arrays.asList(digitFizzMatcher, digitBuzzMatcher, digitWhizzMatcher);
    private List<Matcher> matchers = Arrays.asList(buzzMatcher, fizzMatcher, whizzMatcher);

    public FizzBuzz() {
        Collections.sort(matchers);
    }

    public String count(int number) {
        String digitMatcher = getDigitMatcherResult(number);
        if (!digitMatcher.isEmpty()) return digitMatcher;
        return getMatcherResult(number);
    }

    private String getMatcherResult(int number) {
        StringBuilder result = new StringBuilder();
        for (Matcher matcher : matchers) {
            if (matcher.isMatched(number)) {
                result.append(matcher.getText());
            }
        }
        return (result.length() == 0) ? String.valueOf(number) : result.toString();
    }

    private String getDigitMatcherResult(int number) {
        String[] digits = String.valueOf(number).split("");
        for (String digit : digits) {
            for (DigitMatcher digitMatcher : digitMatchers) {
                if (digitMatcher.isMatched(digit)) {
                    return digitMatcher.getText();
                }
            }

        }
        return "";
    }

}