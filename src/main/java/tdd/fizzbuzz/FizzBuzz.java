package tdd.fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public String countOff(int number) {
        String string = "";
        if(number%3 == 0){
            return string.concat(FIZZ);
        }
        return String.valueOf(number);
    }
}
