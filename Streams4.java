import java.util.stream.Stream;

/**
 * Print Random Numbers and Iterate using Streams
 * @author ashish
 */
public class Streams4 {
    public static void main(String[] args) {
        Stream<Double> stream=Stream.generate(Math::random).limit(10);
        Stream<Integer> input=Stream.iterate(1,i->i+1).limit(10);
        input.forEach(System.out::println);
        stream.forEach(System.out::println);

    }

}
