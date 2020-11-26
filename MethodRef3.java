/**
 * Using Method Reference Example 3
 *
 * @author ashis
 */

interface Length {
    int getLength();
}

public class MethodRef3 {
    public static void main(String[] args) {
        Length length = "abc"::length;
        System.out.println(length.getLength());
    }

}
