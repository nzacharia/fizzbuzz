import org.example.FizzBuzzConvertor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzConvertorLeavesNormalNumbersAlone() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        assertEquals("1",fizzBuzz.convert(1));
        assertEquals("2",fizzBuzz.convert(2));
    }


    @Test
    public void fizzBuzzConvertorMultipleOfThree() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        assertEquals("Fizz",fizzBuzz.convert(3));

    }

    @Test
    public void fizzBuzzConvertorMultipleOfFive() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        assertEquals("Buzz",fizzBuzz.convert(5));

    }

    @Test
    public void fizzBuzzConvertorMultipleOfThreeAndFive() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        assertEquals("FizzBuzz",fizzBuzz.convert(15));

    }

}
