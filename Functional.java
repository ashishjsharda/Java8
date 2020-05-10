package Java8;
import java.util.function.Function;

/**
 * Using Functional Interface
 * @author ashish
 */
public class Functional {
    public static void main(String[] args) {
        Function<Integer,Integer> function=integer -> integer*4;
        function=function.andThen(a->3*a);
        System.out.println(function.apply(4));
        Function<String,Integer> function1=s->s.length();
        System.out.println(function1.apply("Ashish"));
    }
}
