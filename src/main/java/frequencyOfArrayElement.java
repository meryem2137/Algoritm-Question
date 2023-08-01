import java.util.HashMap;
import java.util.Map;

public class frequencyOfArrayElement {
    public static void main(String[] args) {
        String[] arr= {"Apple", "Banana", "apple", "Cherry", "Apple"};
        System.out.println(frequencyOfArray(arr));

    }
    public static String frequencyOfArray(String[] arr){
        Map<String,Integer> list=new HashMap<>();
        for (String each : arr) {
            list.put(each, list.getOrDefault(each,0)+1);
        }
     return list.toString();

    }
}











/*
Write a function that takes a String array as parameter and returns a map object that
contains each element of array as key and their occurrence counts as value.
For calculating occurrence, array elements should be checked by regarding case sensitivity.
Order is not important.
 */