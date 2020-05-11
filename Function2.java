package Java8;
import java.util.function.Function;

/**
 * Using Function
 * @author ashish
 */
public class Function2 {
    public static void main(String[] args) {
        Function<Integer,Integer>function=i->i*4;
        function=function.compose(i->i*3);
        System.out.println(function.apply(8));
    }
}
