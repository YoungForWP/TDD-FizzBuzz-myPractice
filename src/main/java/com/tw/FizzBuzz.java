package com.tw;

public class FizzBuzz {
    private final FizzBuzzMatcher fizzBuzzMatcher = new FizzBuzzMatcher();
    private final BuzzMatcher buzzMatcher = new BuzzMatcher();
    private final FizzMatcher fizzMatcher = new FizzMatcher();

    public FizzBuzz() {
    }

    public String count(int number) {
        if (fizzBuzzMatcher.isMatchedFizzBuzz(number)) {
            return fizzBuzzMatcher.getText();
        }
        if (fizzMatcher.isMatchedFizz(number)) {
            return fizzMatcher.getText();
        }
        if (buzzMatcher.isMatchedBuzz(number)) {
            return buzzMatcher.getText();
        }
        return String.valueOf(number);
    }
}