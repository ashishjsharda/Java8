import java.util.List;

/**
 * Using Streams ->Add a Filter
 * @author ashish
 */
public class Streams12 {
    public static void main(String[] args) {
        List<Integer> list= List.of(10,20,21,30,30,11,21);
        list.stream().filter(n->n>20?true:false).forEach(System.out::println);

    }

}
