import java.util.stream.IntStream;
/**
 * Find Sum of all the numbers
 * @author ashish
 */
public class SumNums {
    public static void main(String[] args) {

        IntStream intStream=IntStream.range(0,20);
        int sum=intStream.sum();
        System.out.println("Sum of the numbers is "+sum);

    }
}
