import java.util.List;

/**
 * Add all numbers in a list using Stream
 * @author ashish
 */
public class StreamAdd {
    public static void main(String[] args) {
        List<Integer> list=List.of(10,20,4,8);
        int sum=list.stream().reduce(0,Integer::sum);
        System.out.println(sum);

    }
}
