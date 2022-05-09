import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class FlatStreams {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java8", "Streams", "Examples");
        words.stream().map(String::length).collect(toList()).forEach(System.out::println);
    }
}
