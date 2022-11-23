import org.example.FizzBuzzConvertor;
import org.junit.jupiter.api.Test;

public class ListOfNumbersFizzBuzzTest
{

    @Test

    public void printListOfFizzBuzz(){
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        for (int i = 0; i <=100 ; i++) {
            System.out.println(fizzBuzz.convert(i));
        }
    }
}
