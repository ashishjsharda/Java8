import java.util.List;
import java.util.Optional;

/**
 * Add all numbers of a list
 * @author ashish
 */
public class Streams14 {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,6);
        Optional<Integer> optional=list.stream().reduce(Integer::sum);
        System.out.println(optional.get());
    }
}
