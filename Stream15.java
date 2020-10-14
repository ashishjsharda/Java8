import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Min and Max using Stream
 * @author ashish
 */
public class Stream15 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        Stream<Integer> stream=arrayList.stream();
        Optional<Integer> min= stream.min(Integer::compare);
        Optional<Integer> max= stream.max(Integer::compare);
        System.out.println("Min number in the list is "+min);
        System.out.println("Max number in the list is "+max);
    }
}
