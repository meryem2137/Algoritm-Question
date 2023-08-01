import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class FindMaxFromIntArray {
    public static void main(String[] args) {
        int[] array = {6, 8, 3, 5, 1, 9};



    }
    public static int findMax(int[] arr){
        return Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
    }





}




/*
Question-1 Find Max from int Array
Write a function that can find the maximum number from an int Array.
input: int[] array = {6, 8, 3, 5, 1, 9}; output: 9
 */