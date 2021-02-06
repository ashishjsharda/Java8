
import java.util.List;
/**
 * Using Parallel Stream
 * @author ashish
 */
public class ParallelStreams2 {
    public static void main(String[] args) {

       List list=List.of(10,20,30);
       list.parallelStream().forEach(System.out::println);

    }
}
