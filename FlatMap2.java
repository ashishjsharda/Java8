import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Example using Flat Map
 * @author ashish
 */
public class FlatMap2 {
    public static void main(String[] args) {

        String fruits []={"Pear","Apple"};
        String vegetables[]={"Potato","Cabbage"};
        Stream<List<String>> stream=Stream.of(Arrays.asList(fruits),Arrays.asList(vegetables));
        stream.flatMap(s->s.stream() ).forEach(System.out::println);
        

    }
}
