
/**
 * MyNum interface
 */
interface MyNum{
    double getNum();
}

/**
 * Example using Lambda Expression
 * @author ashish
 */
public class Lambda9 {

    public static void main(String[] args) {
        MyNum num=()->{
            return 10.0;
        };
        System.out.println(num.getNum());
    }
}
