import java.util.stream.Stream;

/**
 * Example using StreamIterate
 * @author ashish
 */
public class StreamIterate {
    public static void main(String[] args) {
        Stream.iterate(100,n->n+2).limit(20).forEach(System.out::println);

    }
}
