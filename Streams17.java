import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Example using Streams
 * @author ashish
 */
public class Streams17 {
    public static void main(String[] args) {

        int [] ints=new int[]{2,4,6,8,10};
        IntStream.of(ints).forEach(System.out::println);
        double[]doubles=new double[]{1.2,2.4,3.6};
        DoubleStream.of(doubles).forEach(System.out::println);

    }
}
