import java.util.List;

/**
 * Apply multiple filters using Streams
 * @author ashish
 */
public class Filter {
    public static void main(String[] args) {
        List<Integer> list=List.of(10,20,4,8,1,8,12,92,32,41,0,-5,-1,-8);
        list.stream().filter(n->n>0).filter(n->n>20).forEach(System.out::println);

    }
}
