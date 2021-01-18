import java.util.List;
import java.util.Optional;
/**
 * Reduce Operation Stream
 * @author ashish
 */
public class ReduceOp {
    public static void main(String[] args) {
        List<Integer> list=List.of(10,20,1,8,11);
        Optional<Integer> first=list.stream().reduce((a,b)->a+b);
        System.out.println(first.get());
    }
}
