import java.util.stream.Stream;

/**
 * Using Streams [Count,of]
 * @author ashish
 */
public class Streams3 {
    public static void main(String[] args) {
        Stream<String> str=Stream.of("Jack","Rob","Tony");
      //  System.out.println(str.count());
        str.forEach(System.out::println);
        Stream<Integer> empty=Stream.empty();
        System.out.println(empty.count());

    }

}
