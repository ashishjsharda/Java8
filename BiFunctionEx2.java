import java.util.function.BiFunction;

/**
 * Example using BiFunction
 * @author ashish
 */
public class BiFunctionEx2 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction=(a,b) ->a+b;
        System.out.println(biFunction.apply(10,20));
    }
}
