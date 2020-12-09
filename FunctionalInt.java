@java.lang.FunctionalInterface
interface MathOp{

    int add(int num1,int num2);
    //As soon as you add another method the compiler will start complaining
    //int sub(int n1,int n2);
}

/**
 * Example using Functional Interface
 * @author ashish
 */
public class FunctionalInt {
    public static void main(String[] args) {

        MathOp addition=(a,b)->{return a+b;};
        System.out.println(addition.add(10,20));
    }
}
