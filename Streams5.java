import java.util.List;
/**
 * Multiply all list elements by 3
 * @author ashish
 */
public class Streams5 {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5);
        list.stream().map(a->a*3).forEach(System.out::println);

    }

}
