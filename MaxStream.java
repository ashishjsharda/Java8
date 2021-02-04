import java.util.stream.IntStream;
/**
 * Find Max Number
 * @author ashish
 */
public class MaxStream {
    public static void main(String[] args) {

        IntStream intStream=IntStream.range(0,100);
        System.out.println("Max number is "+intStream.max());

    }
}
