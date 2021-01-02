import java.util.List;
import java.util.stream.Collectors;

/**
 * Using Streams
 * @author ashish
 */
public class Streams11 {
    public static void main(String[] args) {
        List<Integer> list= List.of(10,20,21,30,30,11,21);
        //Use Distinict to spit out unique numbers
        List<Integer> list2=list.parallelStream().filter(n->n>20).distinct().collect(Collectors.toList());
        list2.forEach(n->System.out.println(n));

    }

}
