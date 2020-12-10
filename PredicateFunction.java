import java.util.function.Predicate;

/**
 * Using Predicate Functions
 * @author ashish
 */
public class PredicateFunction {
    public static void main(String[] args) {
        Predicate<String> predicate=(s)->s.isEmpty();
        Predicate<Integer> integerPredicate=(a)->a>20;
        System.out.println(predicate.test("Sai"));
        System.out.println(integerPredicate.test(30));
    }
}
