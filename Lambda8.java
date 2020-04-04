/**
 * Math INterface
 */
interface MathOp{
    int op(int x,int y);

}

/**
 * Example using Lambda Expression
 */
public class Lambda8 {
    public static void main(String[] args) {

        MathOp add=(a,b)->{ return a+b ;};
        System.out.println(add.op(10,20));
        MathOp sub=(a,b)->{ return a-b ;};
        System.out.println(sub.op(20,10));
        MathOp mul=(a,b)->{ return a*b ;};
        System.out.println(mul.op(20,10));

    }
}
