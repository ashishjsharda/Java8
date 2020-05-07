package Java8;

/**
 * Interface StringFunc
 */
interface StringFunc{
    String func(String s);
}

/**
 * StringOps
 */
class MyStringOps{
    static String result;
    static String reverse(String input){
        for (int i=input.length()-1;i>=0;i--){
            result=result+input.charAt(i);
        }

        return  result;
    }
}

/**
 * Reverse String
 * @author ashish
 */
public class Reverse {
    static String op(StringFunc stringFunc,String s)
    {
        return stringFunc.func(s);
    }
    public static void main(String[] args) {

        System.out.println("Original String seen is "+op(MyStringOps::reverse,"Sainath"));

    }
}
