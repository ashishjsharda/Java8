import java.util.stream.Stream;

/**
 * Example using Streams Generate
 * @author ashish
 */
public class StreamsGen {
    public static void main(String[] args) {

        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

    }
}
