import java.util.Arrays;
import java.util.List;

/**
 * Example using Reduce
 * @author ashish
 */
public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,20,30,40);
        int sum=list.stream().reduce(Integer::sum).get();
        System.out.println(sum);
    }
}
