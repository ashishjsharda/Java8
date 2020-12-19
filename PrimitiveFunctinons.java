import java.util.function.IntPredicate;

/**
 *Example using Primitive Functions
 * @author ashish
 */
public class PrimitiveFunctinons {
    /**
     * Test if a number is an even number
     * @param num
     * @return boolean
     */
    public static boolean testEvenNumber(int num){
        IntPredicate predicate=(d)->d%2==0;
        return predicate.test(num);
    }

    public static void main(String[] args) {
        System.out.println(testEvenNumber(20));
        System.out.println(testEvenNumber(15));
    }
}
