/**
 * Number Interface
 */
interface Number{
    boolean test(int num);
}

/**
 * Example using Lambda expression
 * @author ashish
 */
public class Lambda21 {
    public static void main(String[] args) {

        Number even=(x) ->{if (x%2==0){
        return true;}
        return false;
        };
        System.out.println("Number is an even number"+even.test(10));
        Number odd=(x) ->{if (x%2!=0){
            return true;}
            return false;
        };
        System.out.println("Number is an odd number"+ odd.test(11));
    }
}
