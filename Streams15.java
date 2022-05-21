import java.util.*;

/**
 * Example using Streams
 * @author ashish
 */
public class Streams15 {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> firstSquareDivisibleByThree = list.stream().map(x->x*x).filter(x->x%3==0).findFirst();
        System.out.println(firstSquareDivisibleByThree.get());

    }
}
