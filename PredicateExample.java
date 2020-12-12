import java.util.function.Predicate;

/**
 * Demo using Predicate And
 * @author ashish
 */
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate=(t)->t>10;
        Predicate<Integer> predicate1=(a)->a>20;
        //Using Predicate Ana
        Predicate<Integer> predicateAnd=predicate.and(predicate1);
        System.out.println(predicateAnd.test(15));
    }
}
