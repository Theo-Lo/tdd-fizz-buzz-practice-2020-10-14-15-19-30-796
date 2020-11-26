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
}
