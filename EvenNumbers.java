import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Find Even Numbers using Stream
 * @author ashish
 */
public class EvenNumbers {
    public static void main(String[] args) {

        Map<Boolean, List<Long>> collect = IntStream.range(1, 10).mapToObj(Long::new).collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(collect);
    }
}
