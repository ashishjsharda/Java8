
/**
 * Create  Predicate Function
 * @author ashish
 */

@FunctionalInterface
interface Ash<T>{
    boolean test(T t);
}
public class CreatePredicateFunction {
    public static void main(String[] args) {
        Ash<String> predicate=(s)->s.isEmpty();
        Ash<Integer> integerPredicate=(a)->a>20;
        System.out.println(predicate.test("Sai"));
        System.out.println(integerPredicate.test(30));
    }
}
