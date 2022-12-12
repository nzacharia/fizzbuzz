package org.example;

public class FizzBuzzConvertor {
    public String convert(int i) {
        if (i % 15 == 0) {
            //if i divided by 3 and 5 and second digit is 5 or 3
            if ( i / 10 == 5) {return "FizzBuzzBuzz"; }
//            if ( i / 10 == 3) {return "FizzBuzzFizz"; }
            return "FizzBuzz";
        }

        if (i % 3 == 0 ) {
            if (i % 10 == 3 && i / 10 == 3) {return "Fizz"; }

            if ((i % 10 == 3 && i > 10) || i / 10 == 3)  {return "Fizz"; }

            return "Fizz";

        }
        if (i % 5 == 0) {
            if (i % 10 == 5 && i / 10 == 5) {return "BuzzBuzzBuzz"; }

            if ((i % 10 == 5 && i > 10) || i / 10 == 5) {return "Buzz"; }

            return "Buzz";
        }
        if (( i / 10 == 5) && (i % 10 == 3 || i / 10 == 3)) {return "FizzBuzz"; }
        if ( i / 10 == 5) {return "Buzz"; }
        if (i % 10 == 3|| i / 10 == 3) {return "Fizz"; }
        return  String.valueOf(i);
    }
}
