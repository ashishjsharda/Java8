import java.util.List;
/**
 * Stream Example -Provide Initial Value
 * @author ashish
 */
public class StreamInitial {
    public static void main(String[] args) {
        List<Integer> list=List.of(10,20,1,8,11);
        int val=list.stream().reduce(10,(a,b)->a+b);
        System.out.println(val);
    }
}
