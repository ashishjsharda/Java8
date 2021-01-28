import java.util.List;
import java.util.stream.Stream;

/**
 * Example using Flat Map
 * @author ashish
 */
public class FlatMap {
    public static void main(String[] args) {

        List<String> employees=List.of("Raj","Sai","Ram");
        employees.stream().flatMap(s-> Stream.of(s)).forEach(System.out::println);

    }
}
