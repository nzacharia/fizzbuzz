import org.example.FizzBuzzConvertor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzConvertorNotDivisibleByFiveOrThreeAndNotContainThreeOrFive() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        assertEquals("1",fizzBuzz.convert(1));
        assertEquals("2",fizzBuzz.convert(2));
    }




    @Test
    public void fizzBuzzConvertorDivisibleByThreeOrContainThree() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        assertEquals("Fizz",fizzBuzz.convert(3));
        assertEquals("Fizz",fizzBuzz.convert(6));
        assertEquals("Fizz",fizzBuzz.convert(18));
        assertEquals("Fizz",fizzBuzz.convert(13));
        assertEquals("Fizz",fizzBuzz.convert(31));
    }


    @Test
    public void fizzBuzzConvertorDivisibleByFiveOrContainFiveNotThree() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        assertEquals("Buzz",fizzBuzz.convert(5));
        assertEquals("Buzz",fizzBuzz.convert(10));
        assertEquals("Buzz",fizzBuzz.convert(20));
        assertEquals("Buzz",fizzBuzz.convert(56));
        assertEquals("Buzz",fizzBuzz.convert(25));
    }

    //(contain 3 not 5) and divisible by 3 => Fizz + Fizz
    //(contain 5 not 3) and divisible by 3 => Fizz + Buzz
    //(contain 5 and 3) and divisible by 3 => Fizz + Buzz + Fizz => not such a number
    @Test
    public void fizzBuzzConvertorDivisibleByThreeAndContainThreeNotFive() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        assertEquals("Fizz",fizzBuzz.convert(33));
        assertEquals("Fizz",fizzBuzz.convert(93));
    }

    public void fizzBuzzConvertorDivisibleByThreeAndContainFiveNotThree() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        assertEquals("FizzBuzz",fizzBuzz.convert(15));
        assertEquals("FizzBuzz",fizzBuzz.convert(45));
    }
    public void fizzBuzzConvertorContainThreeAndFive() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        assertEquals("FizzBuzz",fizzBuzz.convert(53));

    }
    //(contain 3 not 5) and divisible by 5 => only 30 but is divisible with 3 also
    //(contain 5 not 3) and divisible by 5 => Buzz + Buzz
    //(contain 5 and 3) and divisible by 5 ==> Fizz + Buzz + Buzz



    public void fizzBuzzConvertorDivisibleByFiveAndContainFiveNotThree() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        assertEquals("BuzzBuzz",fizzBuzz.convert(50));
        assertEquals("BuzzBuzz",fizzBuzz.convert(25));
        assertEquals("BuzzBuzz",fizzBuzz.convert(65));
        assertEquals("BuzzBuzz",fizzBuzz.convert(55));
    }

    public void fizzBuzzConvertorDivisibleByFiveAndContainFiveAndThree() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        assertEquals("FizzBuzzBuzz",fizzBuzz.convert(35));
    }



}
