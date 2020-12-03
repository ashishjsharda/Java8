/**
 * Movie Class
 */
class Movie{
    static int id;
    public Movie(int id)
    {
        this.id=id;
    }

    public static void getId()
    {
        System.out.println(id);
    }
}
//Interface
interface MovieFactory{
    public void get();

}
public class FunctionalInterface {
    public static void main(String[] args) {

        Movie movie=new Movie(20);
        MovieFactory movieFactory=Movie::getId;
        MovieFactory movieFactory2=()->Movie.getId();
        movieFactory2.get();
        //movieFactory.get();

    }
}
