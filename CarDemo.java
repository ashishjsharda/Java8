interface CarType{
    default String getType(){
        return "Tesla";
    }
}
interface Model{
    default String getModel(){
        return "Model 3";
    }
}

/**
 * Example using default methods in Interfaces
 * @author ashish
 */
class Car implements CarType,Model{
    public String getCar(){
        return CarType.super.getType() + " " +Model.super.getModel();
    }
}
public class CarDemo {
    public static void main(String[] args) {
        Car car=new Car();
        System.out.println(car.getCar());
    }
}
