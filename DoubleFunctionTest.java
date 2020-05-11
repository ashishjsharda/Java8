package Java8;
import java.util.function.DoubleFunction;

/**
 * Using Double Function
 * @author ashish
 */
public class DoubleFunctionTest {
    public static void main(String[] args) {
        DoubleFunction<Integer> doubleFunction=i->(int)i*10;
        System.out.println(doubleFunction.apply(10.2));
    }
}
