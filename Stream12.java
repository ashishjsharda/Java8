import java.util.Arrays;
import java.util.List;
/**
 * Filter Empty Strings
 * @author ashish
 */
public class Stream12 {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("Sai",""," ","Sainath");
        long count=list.parallelStream().filter(s->s.isEmpty()).count();
        System.out.println("Count seen is " +count);
    }
}
