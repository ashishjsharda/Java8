import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Using Streams to filter only even numbers
 * @author ashish
 */
public class StreamEx3 {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,41,11);
        list.stream().filter(num->num%2==0).collect(Collectors.toList()).forEach(System.out::println);
    }
}
