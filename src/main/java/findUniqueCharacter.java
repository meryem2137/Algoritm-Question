import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class findUniqueCharacter {
    public static void main(String[] args) {
        String a="succes";
        char c=findUnique(a);
        System.out.println(c);
    }
    public static char findUnique(String arr) {
        Map<Character, Integer> list = new HashMap<>();
        for (char each : arr.toCharArray()) {
            list.put(each, list.getOrDefault(each,0)+1);
        }
        for (char c : arr.toCharArray()) {
            if (list.get(c)==1)
                return c;
        }return ' ';

    }

}









/*
Write a function that returns the first non-repeated character from a string.
If all characters are repeated return a space character.
 */