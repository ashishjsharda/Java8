import java.util.List;
import java.util.Optional;
/**
 * Find first element
 * @author ashish
 */
public class StreamsFindFirst {
    public static void main(String[] args) {
        List<Integer> list=List.of(10,20,1,8,11);
        Optional<Integer> first=list.stream().filter(n->n>10).findFirst();
        System.out.println(first.get());
    }
}
