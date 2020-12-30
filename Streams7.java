import java.util.List;
import java.util.Optional;

/**
 * Using Streams
 * @author ashish
 */
public class Streams7 {
    public static void main(String[] args) {
        List<Integer> list= List.of(10,20,30,11,21);
        Optional<Integer> num=list.stream().filter(n->n>20).findFirst();
        System.out.println(num);
    }

}
