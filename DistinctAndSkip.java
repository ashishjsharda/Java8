import java.util.List;
/**
 * Using Distinct and Skip
 * @author ashish
 */
public class DistinctAndSkip {
    public static void main(String[] args) {
        List<String> list=List.of("Jack","Jill","Tom","Harry","Jack","Jill","Ram","Sai","Jack","Jill");
        list.stream().skip(3).distinct().forEach(System.out::println);
    }
}
