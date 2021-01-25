import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Using PartitioningBy
 * @author ashish
 */
public class PartitioningBy {
    public static void main(String[] args) {

        Stream<Integer> stream=Stream.of(10,4,8,5,1,0,2);
        Map<Boolean, List<Integer>> collect = stream.collect(Collectors.partitioningBy(num -> num > 4));
        System.out.println(collect);
    }
}
