import java.io.IOException;
import java.util.stream.IntStream;

/**
 * Using IntStream
 * @author ashish
 */
public class IntStreamTut {
    public static void main(String[] args) throws IOException {
        IntStream.range(5,40).forEach(System.out::println);

    }
}
