/**
 * Basic Lambda
 * @author ashish
 */
interface Square{
    public int square(int num);
}
public class BasicLambda {
    public static void main(String[] args) {
       Square square=(a) ->a*a;
        System.out.println(square.square(10));
    }
}
