interface Employee{
    Employee find(int id);
    default boolean isTrue(){
        return true;
    }
    static  String getEmpCountry()
    {
        return "USA";
    }

}

/**
 * Example using Interface Methods
 * @author ashish
 */
public class InterfaceMethods {
    public static void main(String[] args) {
        class EmployeeEmpl implements Employee{

            @Override
            public Employee find(int id) {
                boolean ex=isTrue();
                System.out.println(ex);
                return null;
            }


        }
        EmployeeEmpl employeeEmpl=new EmployeeEmpl();
        System.out.println(employeeEmpl.find(40));
        System.out.println(Employee.getEmpCountry());

    }
}
