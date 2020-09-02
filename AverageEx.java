import java.util.Arrays;

/**
 * Find Average
 * @author ashish
 */
public class AverageEx {
    public static void main(String[] args) {
        Arrays.stream(new int []{10,20,30}).average().ifPresent(System.out::println);
    }
}
