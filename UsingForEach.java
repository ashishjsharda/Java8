package Java8;
import java.util.ArrayList;
import java.util.List;

/**
 * Using ForEach
 * @author ashish
 */
public class UsingForEach {

    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Sneha");
        list.add("AJ");
        list.add("Bubu");
        list.add("Ashish");
        list.forEach(System.out::println);
    }
}
