import java.util.stream.LongStream;

/**
 * Example using Long Streams
 * @author ashish
 */
public class LongStreams {
    public static long parallelRangedSum(long n) {
        return LongStream.rangeClosed(1, n)
                .parallel()
                .reduce(0L, Long::sum);
    }
    public static void main(String[] args) {

        System.out.println(parallelRangedSum(20));

    }
}
