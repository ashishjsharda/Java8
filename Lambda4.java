
/**
 * Define Interface
 * @author ashish
 */
interface Games{
    public String getGame();
}

/**
 * Using Lambda Expressions
 * @author ashish
 */
public class Lambda4 {
    public static void main(String[] args) {

        //Before Java 8
        Games games1=new Games() {
            @Override
            public String getGame() {
                return "Cricket";
            }
        };
        System.out.println(games1.getGame());
        Games games=()->"Cricket";
        System.out.println(games.getGame());

    }
}
