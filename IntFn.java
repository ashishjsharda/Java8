package Java8;
import java.util.function.IntFunction;

/**
 * Using IntFunction
 * @author ashish
 */
public class IntFn {
    public static void main(String[] args) {
        IntFunction<Double> intFunction=a->a/2.0;
        System.out.println(intFunction.apply(20));
        IntFunction<Boolean> booleanIntFunction=a->a%2==0;
        System.out.println(booleanIntFunction.apply(20));
    }
}
