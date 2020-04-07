
import java.time.LocalDate;

public class TesterClass {
    public static void main(String[] args) {

        Employee me = new Employee();
        me.setId();
        me.setPosition("General Manager");
        
        me.setEmployementStartDate(1994, 8, 19);
        me.setEmployementEndtDate(2015, 4, 25);
        
        me.setBaseWage(5000);
        me.setGosiPercentage();
        me.setHousingAllowance();
        me.setTransportationAllowance();
        
        System.out.println("Summar of object (me)");
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println(me.getId());
        System.out.println(me.getPosition());
        System.out.println(me.getEmployementStartDate());
        System.out.println(me.getEmployementEndDate());
        System.out.println(me.isOnTheJob() + " and" +" he served "+me.getYearsOfService()+" years, "+me.getMonthsOfService()+" months,"+" and "+me.getDaysOfService()+" days.");
        System.out.println("Base Wage: " + me.getBaseWage());
        System.out.println("Net Salary: " + me.getNetSalary());

    }
    
}
