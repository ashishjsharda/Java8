import java.lang.reflect.Field;

class Thing{
    private boolean flag;
    protected float f;
    public char c;
}

class MyThing extends Thing{
    private int num;
    protected String string;
    public double val;
}
public class ClassFieldsEx {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<?>c1=MyThing.class;
        System.out.println("Public fields for class"+c1.getName());
        Field field= c1.getField("val");
        Field[]fields=c1.getFields();
        for (Field field1:fields
             ) {
            System.out.println(field1);
        }
        System.out.println(field);
    }

}
