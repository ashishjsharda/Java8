import java.util.List;
import java.util.stream.Stream;

public class StreamEx {

        public static void main(String[] args) {
                List<String> stringList=List.of("I am","a","list","of","strings");
            Stream<String> stringStream=stringList.stream().limit(4).collect(java.util.stream.Collectors.toList()).stream();
            stringStream.forEach(System.out::println);

        }
}

