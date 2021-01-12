import java.util.List;
/**
 * Convert to Upper Case
 * @author ashish
 */
public class StreamsUpperCase {
    public static void main(String[] args) {
        List<String> list=List.of("Jack","Jill","Tom");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
