import java.util.Arrays;
import java.util.stream.IntStream;

public class FindFactorial {
    public static void main(String[] args) {
       int factorial=findFactorial(5);
        System.out.println(factorial);
    }
    public static int findFactorial(int a) {
        return IntStream.rangeClosed(1,a).reduce(1,(x,y)->x*y);

        }

    }






/*
Write a method that returns the factorial number of any given number.
 */