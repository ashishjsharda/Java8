import java.util.stream.IntStream;

/**
 * Example using Range
 * @author ashish
 */
public class StreamRange {
    public static void main(String[] args) {

        IntStream intStream=IntStream.range(0,100);
        intStream.forEach(System.out::println);

    }
}
