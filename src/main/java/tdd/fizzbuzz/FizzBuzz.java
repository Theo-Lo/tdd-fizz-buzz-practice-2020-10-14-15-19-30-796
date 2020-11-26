package tdd.fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public String countOff(int number) {
        String string = "";
        if(number%3 == 0){
            return string.concat(FIZZ);
        }
        if(number%5 == 0){
            return string.concat(BUZZ);
        }
        return String.valueOf(number);
    }
}
