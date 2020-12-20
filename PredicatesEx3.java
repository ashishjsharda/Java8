import java.util.function.DoublePredicate;

/**
 * Example using Double Predicate
 * @author ashish
 */
public class PredicatesEx3 {
    public static void main(String[] args) {
        DoublePredicate doublePredicate=(d)-> {
            return d>10;
        };

        System.out.println(doublePredicate.test(20));
    }
}
