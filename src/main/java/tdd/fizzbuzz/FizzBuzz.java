package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int number) {
        String string = "";
        if(number%3 == 0){
            return string.concat("Fizz");
        }
        return String.valueOf(number);
    }
}
