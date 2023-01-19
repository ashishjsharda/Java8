import java.util.Arrays;
import java.util.List;

/**
 *
 * Filter out odd elements
 * @author ashish
 */
public class Streams27 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.stream().filter(i -> i % 2 != 0).forEach(System.out::println);
    }
}
