abstract class  Parent
{
    static String member ="Great Grand Father";
}

interface Display{

    public String show(String member);
}

/**
 * Example using Lambda
 * @author ashish
 *
 */
public class FamilyTree extends Parent{

    public static void main(String[] args) {

        Display display=(member) ->{
            System.out.println("Member Name  "+member);
            System.out.println("Parent Member name "+Parent.member);
            return member;
        };

        display.show("SON");
    }
}
