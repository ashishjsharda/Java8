package CompleteReference;

/*
Interface for Multiple

 */
interface Multiple {
    boolean test(int num, int div);
}

/**
 * Example using Multiple
 *
 * @author ashish
 */
public class LambdaMultipleExp {
    public static void main(String[] args) {

        Multiple multiple = (int num, int div) -> {
            if (num % div == 0) {
                return true;
            }
            return false;
        };
        System.out.println(multiple.test(10, 2));
        System.out.println(multiple.test(11, 3));

    }
}
