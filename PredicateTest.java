package Java8;
import java.util.function.Predicate;

/**
 * Using Predicates check if a number is divisible by 2
 * @author ashish
 */
public class PredicateTest {
    public static void main(String[] args) {
        PredicateTest predicateTest=new PredicateTest();
        System.out.println(predicateTest.test(n->n%2==0,11));

    }

    /**
     * Test if a number is divisible by 2
     * @param predicate
     * @param num
     * @return boolean
     */
    public boolean test(Predicate<Integer> predicate,int num) {
        return predicate.test(num);
    }
}
