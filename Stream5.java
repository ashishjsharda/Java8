import java.util.List;
import java.util.stream.Collectors;

/**
 * Using Streams
 * @author ashish
 */
public class Streams5 {
    public static void main(String[] args) {
        List<Integer> list= List.of(10,20,30,11,21);
        List<Integer> list2=list.parallelStream().filter(n->n>20).limit(1).collect(Collectors.toList());
        list2.forEach(n->System.out.println(n));

    }

}
