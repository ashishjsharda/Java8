import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;

public class FlatStreamsSq {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> squares=list.stream().map(n->n*n).collect(Collectors.toList());
        squares.forEach(System.out::println);

    }
}
