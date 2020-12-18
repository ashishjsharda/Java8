import java.util.function.Function;

/**
 * Example using Functions
 * @author ashish
 */
public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer,Integer> function = (id) ->{
            if(id>10){
                return id+100;
            }
            return id;
        };

        System.out.println(function.apply(20));
        System.out.println(function.apply(5));
    }
}
