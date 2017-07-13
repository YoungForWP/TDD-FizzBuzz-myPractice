package com.tw;

public class FizzBuzz {
    public FizzBuzz() {
    }

    public String count(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}