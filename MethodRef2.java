import java.util.stream.IntStream;

/**
 * Using Method Reference Example 2
 * @author ashis 
 */
public class MethodRef2 {
    public static void main(String[] args) {
       IntStream.range(0,10).forEach(System.out::println);
    }

}
