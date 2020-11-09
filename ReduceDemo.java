import java.util.stream.Stream;

/**
 * Using Reduce
 * @author ashish
 */
public class ReduceDemo {
    public static void main(String[] args) {
        double sum= Stream.of(2,3,5,7,10).reduce(0,(x,y)->{return x+y;});
        System.out.println(sum);
    }
}
