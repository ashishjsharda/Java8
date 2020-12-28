import java.util.function.BiConsumer;

/**
 * Example using BiConsumer
 * @author ashish
 */
public class BiConsumerEx {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer=(name,sal)->{
            System.out.println("Employrr Name is " +name +" and his salary is "+sal);
        };
        biConsumer.accept("Sai",100000);
    }
}
