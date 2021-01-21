import java.util.Optional;
/**
 * Using Optional of and Null
 * @author ashish
 */a
public class Optionals3 {
    public static void main(String[] args) {
       Optional <String> optional= Optional.ofNullable(null);
        System.out.println(optional);
        Optional <String> empty = Optional.empty();
        System.out.println(empty);
    }
}
