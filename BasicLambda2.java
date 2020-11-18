/**
 * Basic Lambda 2
 * @author ashish
 */
interface Concatenate{
    public String concat(String input1,String input2);
}
public class BasicLambda2 {
    public static void main(String[] args) {
       Concatenate concatenate=((input1, input2) -> input1+input2);
        System.out.println(concatenate.concat("Joe","Ryan"));
    }
}
