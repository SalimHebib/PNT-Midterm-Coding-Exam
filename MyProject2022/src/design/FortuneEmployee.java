package design;
import java.text.ParseException;
public class FortuneEmployee {


    public static void main(String[] args) throws ParseException {

        EmployeeInfo employee = new EmployeeInfo("SALIM", 01);
        EmployeeInfo.setCompanyName("PNT");
        employee.setSalary(100000);
        employee.setSsn("565.09.5432");
        employee.setEmployeeId(001);
        employee.setEmail("salamo.hebib@gmail.com");
        employee.setDate_of_birth("01/08/1984");
        employee.assignDepartment();
        employee.benefitLayout();
        employee.printInfo();
        int bonus=EmployeeInfo.calculateEmployeeBonus(100000, "best");
        System.out.println("your bonus is "+bonus);
        int pension = EmployeeInfo.calculateEmployeePension(5, 100000);
        System.out.println("your pension is "+ pension);
        System.out.println("**************** Accessing abstract class properties*******");
        // Access the static methods with the class name
        AbstractEmployee.meeting();

        // Access the abstract class properties with EmployeeInfo object
        System.out.println("Experience: " + employee.yearsOfExperience);
        employee.travelTheWorld();
        employee.giveInstructions();


    }

}
