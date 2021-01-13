import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Use Collect and Filter
 * @author ashish
 */
public class StreamCollect {
    public static void main(String[] args) {
        List<String> list=List.of("Jack","Jill","Tom","Harry","Ram");
        Set<String> set=list.stream().filter(s->s.length()>3).collect(Collectors.toSet());
        set.stream().forEach(System.out::println);
    }
}
