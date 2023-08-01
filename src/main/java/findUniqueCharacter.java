import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class findUniqueCharacter {

    public static char findUnique(String arr) {
        Map<Character, Integer> list = new HashMap<>();
        arr.chars().mapToObj(c -> (char) c).forEach(c -> list.put(c, list.getOrDefault(c, 0)+1));

        Optional<Character> firstUnique = list.entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        return firstUnique.orElse(' ');

    }

}









/*
Write a function that returns the first non-repeated character from a string.
If all characters are repeated return a space character.
 */