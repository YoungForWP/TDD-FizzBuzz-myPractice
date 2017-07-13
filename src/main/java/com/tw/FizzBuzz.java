package com.tw;

public class FizzBuzz {
    public FizzBuzz() {
    }

    public String count(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}