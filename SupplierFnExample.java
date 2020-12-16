import java.util.function.Supplier;

/**
 * Example using Suppliers
 * @author ashish
 */
public class SupplierFnExample {
    public static void main(String[] args) {
        Supplier<String []> fruitSupplier=()->new String[]{"Apples","Oranges"};
        String[] fruits=fruitSupplier.get();
        for (String fruit:fruits){
            System.out.println(fruit);
        }
    }
}
