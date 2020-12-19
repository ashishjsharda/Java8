import java.util.function.Function;


/**
 * Example using Functions
 * @author ashish
 */
public class FunctionExample2 {
    public static void main(String[] args) {

        Function<Integer, String> function = (d) ->{
            if(d>0){
                return "Num is greater than 0";
            }
            return "Num is less than 0";
        };
        System.out.println(function.apply(20));

    }
}
