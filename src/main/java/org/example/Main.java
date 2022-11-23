package org.example;

public class Main {
    public static void main(String[] args) {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        for (int i = 0; i <=100 ; i++) {
            System.out.println(fizzBuzz.convert(i));
        }
    }
}