
//Declare an interface
interface Type {
    public boolean isClassic(int id);
}

/**
 * Example using Method Reference
 *
 * @author ashish
 */
public class MovieType {

    public static boolean isClassic(int id) {
        System.out.println("In Method Reference call");
        return id > 100 ? true : false;
    }

    public static void main(String[] args) {

        Type type = (i) -> i > 100 ? true : false;
        System.out.println(type.isClassic(10));
        Type type1 = MovieType::isClassic;
        System.out.println(type1.isClassic(120));
    }
}
