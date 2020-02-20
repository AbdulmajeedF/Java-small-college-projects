
import java.time.LocalDate;

public class TesterClass {
    public static void main(String[] args) {

        Employee obj = new Employee();
        obj.setId();
        obj.setPosition("General Manager");
        
        obj.setEmployementStartDate(1994, 8, 19);
        obj.setEmployementEndtDate(2018, 8, 19);
        obj.isOnTheJob();
        obj.setBaseWage(5000);
        obj.setGosiPercentage();
        obj.setHousingAllowance();
        obj.setTransportationAllowance();
        
        System.out.println("Summar of object (me)");
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println(obj.getId());
        System.out.println(obj.getPosition());
        System.out.println(obj.getEmployementStartDate());
        System.out.println(obj.getEmployementEndDate());
        obj.isOnTheJob();
        System.out.println(obj.getYearsOfService());
        System.out.println(obj.getBaseWage());
        System.out.println(obj.getNetSalary());

    }
    
}
