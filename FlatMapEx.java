import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Jack", "Lambdas", "In", "Austin");
        List<String> uniqueChars=words.stream().map(w->w.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        uniqueChars.forEach(System.out::println);
    }
}
