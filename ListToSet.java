import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Convert List to Set
 * @author ashish
 */
public class ListToSet {
    public static void main(String[] args) {
        List<String> list=List.of("Jack","Jill","Tom");
        Set<String> set=list.stream().collect(Collectors.toSet());
        set.stream().forEach(System.out::println);
    }
}
