package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_normal_number_when_order_is_given(){
        //Given
        int number = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String order = fizzBuzz.countOff(number);
        //Then
        assertEquals("1", order);
    }

    @Test
    void should_return_Fizz_when_multiple_of_3_is_given(){
        //Given
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String order = fizzBuzz.countOff(number);
        //Then
        assertEquals("Fizz", order);
    }

    @Test
    void should_return_Buzz_when_multiple_of_5_is_given(){
        //Given
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String order = fizzBuzz.countOff(number);
        //Then
        assertEquals("Buzz", order);
    }

    @Test
    void should_return_Whizz_when_multiple_of_7_is_given(){
        //Given
        int number = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String order = fizzBuzz.countOff(number);
        //Then
        assertEquals("Whizz", order);
    }
}
