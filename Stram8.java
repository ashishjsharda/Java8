import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Using Streams
 * @author ashish
 */
public class Stram8 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,4,5);
        List<Integer> distinct=numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
        distinct.forEach(System.out::println);
    }
}
