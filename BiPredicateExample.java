import java.util.function.BiPredicate;

/**
 * Example using BiPredicate
 * @author ashish
 */
public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer,String> biPredicate=(n, s) ->{
            if(n==Integer.parseInt(s)){
                return true;
            }
            return false;
        };

        System.out.println(biPredicate.test(20,"30"));

    }
}
