package com.tw;

public class Matcher implements Comparable {
    private final int modulus;
    private final String text;
    private final int priority;

    Matcher(int modulus, String text, int priority) {
        this.modulus = modulus;
        this.text = text;
        this.priority = priority;
    }

    static Matcher fizz() {
        return new Matcher(3, "Fizz", 1);
    }


    static Matcher buzz() {
        return new Matcher(5, "Buzz", 2);
    }


    static Matcher whizz() {
        return new Matcher(7, "Whizz", 3);
    }


    public boolean isMatched(int number) {
        return number % modulus == 0;
    }

    public String getText() {
        return text;
    }

    public int priority(){
        return priority;
    }

    @Override
    public int compareTo(Object o) {
        Matcher other = (Matcher) o;
        return Integer.compare(priority(), other.priority());
    }
}
