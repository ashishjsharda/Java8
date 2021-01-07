import java.util.List;
/**
 * Filter a Stream
 * @author ashish
 */
public class Streams13 {
    public static void main(String[] args) {
        List<String> list=List.of("Josh"," ","Rick","Nicholas");
        list.stream().filter(s->!s.isBlank()).forEach(System.out::println);
    }
}
