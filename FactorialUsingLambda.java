package CompleteReference;

/**
 * Factorial Interface
 */
interface Fact{
    int fact(int n);
}

/**
 * Factorial using Lambda
 * @author ashish
 */
public class FactorialUsingLambda {


    public static void main(String[] args) {
        Fact factorial =(n) ->{
            int result=1;
            for(int i=1;i<=n;i++)
            {
                result=result*i;
            }
            return result;
        };
        System.out.println(factorial.fact(3));

    }
}
