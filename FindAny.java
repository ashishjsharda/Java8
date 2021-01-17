import java.util.List;
import java.util.Optional;
/**
 * Find Any element >10 
 * @author ashish
 */
public class FindAny {
    public static void main(String[] args) {
        List<Integer> list=List.of(10,20,1,8,11);
        Optional<Integer> first=list.stream().filter(n->n>10).findAny();
        System.out.println(first.get());
    }
}
