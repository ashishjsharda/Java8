import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Search a word amongst a string array
 * @author ashish
 */
public class Search {
    public static void main(String[] args) {
        String[]animals={"tiger","lion","dog","tiger"};
        List<String> list= Arrays.asList(animals);
        String tiger=list.stream().filter(s->s.equalsIgnoreCase("tiger")).collect(Collectors.joining(","));
        System.out.println(tiger);
    }
}
