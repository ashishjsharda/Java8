import java.util.stream.Stream;

/**
 * Fibonacci 
 * @author ashish
 */
public class FibonacciUsingStreams {
    public static void main(String[] args) {

        Stream.iterate(new int[]{0, 1},
                        t -> new int[]{t[1],t[0] + t[1]})
                .limit(10)
                .map(t -> t[0])
                .forEach(System.out::println);

    }
}
