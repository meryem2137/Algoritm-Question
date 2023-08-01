import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayOfDigits {
    public static void main(String[] args) {
        int a=490;
       int[] arr= arrayOfDigits(a);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] arrayOfDigits(int arr){
        return String.valueOf(arr)
                .chars()
                .map(Character::getNumericValue)
                .toArray();

    }
}
