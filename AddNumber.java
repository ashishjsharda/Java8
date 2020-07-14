import java.util.Arrays;
import java.util.List;

/**
 * Add Number using Streams
 * @author ashish
 */
public class AddNumber {
    public static void main(String[] args) {
        List<Integer> alist= Arrays.asList(10,20,30,40);
        int total=alist.stream().reduce(0,(a,b)->a+b);
        System.out.println(total);

    }
}
