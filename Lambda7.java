package Java8;

/**
 * Test Interface
 * @author ashish
 */
interface Test{
    public int add(int a,int b);
    default void print(){
        System.out.println("Hi ,simply testing");
    };
}

/**
 * Example using Lambda Expression
 * @author ashish
 */
public class Lambda7 {
    public static void main(String[] args) {
        Test add=(a,b) ->{
            int c=a+b;
            return c;
        };
        System.out.println(add.add(10,20));
        Test Test=new Test() {
            @Override
            public int add(int a, int b) {
                return 40;
            }
        };
        Test.print();

    }
}
