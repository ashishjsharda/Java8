import java.util.function.Consumer;

/**
 * Example using Consumer Function
 * @author ashish
 */
public class ConsumerEx {
    public static void main(String[] args) {
        Consumer<String> consumer=m-> System.out.println(m);
        consumer.accept("Test");
    }
}
