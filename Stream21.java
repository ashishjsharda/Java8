import java.util.stream.Stream;

/**
 * Generate Random Numbers using Streams
 * @author ashish
 */
public class Stream21 {
    public static void main(String[] args) {

        Stream.generate(Math::random).limit(10).forEach(System.out::println);

    }
}
