import java.util.Arrays;

/**
 * Find numbers greater than 30
 * @author ashish
 */
public class Stream9 {
    public static void main(String[] args) {
        long count=Arrays.asList(10,20,0,30,40).stream().filter(n->n>=30).count();
        System.out.println("Numbers greater than 30 are "+count);
    }
}
