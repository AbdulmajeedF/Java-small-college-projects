import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Random;

public class Employee {

    private int id;
    
    private String position;
    
    public int employementStartYear;
    public int employementStartMonth;
    public int employementStartDay;
    public int employementEndYear;
    public int employementEndMonth;
    public int employementEndDay;
    public int yearsOfService;
    public int monthsOfService;
    public int daysOfService;
    private boolean isOnTheJob;
    public String status = null;
    
    private double baseWage;
    private double gosiPercentage;
    private double housingAllowance;
    private double transportationAllowance;
    private double netSalary;
    
        
    public LocalDate startingDate = null;
    public LocalDate endingDate = null;
    LocalDate today = LocalDate.now();
    
    public Employee (){
      
      id = 0;
      position = "NO_POSITION";
      employementStartYear = 0;
      employementStartMonth = 0;
      employementStartDay = 0;
      employementEndYear = 0;
      employementEndMonth = 0;
      employementEndDay = 0;
      yearsOfService = 0;
      monthsOfService = 0;
      daysOfService = 0;
      baseWage = 0;
      gosiPercentage = 0;
      housingAllowance = 0;
      transportationAllowance = 0;
      netSalary = 0;
        
    }
    public void setId (){
        Random rand = new Random();
        HashSet <Integer> set = new HashSet <>();
        while (set.size()<1){
            int random = rand.nextInt(100000000)+1;
            id = random;
            set.add(random);
        }
    }
    public void setPosition(String newPosition){
        position = newPosition;
    }
    public void setEmployementStartDate (int year,int month,int day){
        employementStartYear = year;
        employementStartMonth = month;
        employementStartDay = day;   
        
        startingDate = LocalDate.of(year, month, day);
        
    }
    public void setEmployementEndtDate (int year, int month,int day){
        employementEndYear = year;
        employementEndMonth = month;
        employementEndDay = day;     
        
        endingDate = LocalDate.of(year, month, day);
    }
    public String isOnTheJob(){
        
        
        if (endingDate.getYear() > today.getYear()){
            isOnTheJob = true;
            status = "The employee is on the job now";
        } else if (endingDate.getYear() < today.getYear()){
            isOnTheJob = false;
            status = "The employee is not on the job now";
        }
        return status;
    } 
    public void setBaseWage(double Wage){
        baseWage = Wage;
    }
    public void setGosiPercentage(){
        gosiPercentage = (baseWage / 100) * 9;
    }
    public void setHousingAllowance(){
        housingAllowance = (baseWage / 100) * 25;
    }
    public void setTransportationAllowance (){
        transportationAllowance = (baseWage/100)*10;
    }
    public void chanageGosiPercentage(double newPercentage){
        gosiPercentage = newPercentage;
    }
    public void changeHousingAllowance(double newHousingAllowance){
        housingAllowance = newHousingAllowance;
    }
    public void changeTransportationAllowance(double newTransportationAllowance){
        transportationAllowance = newTransportationAllowance;
    }
    public int getId (){
        return id;
    }
    public String getPosition(){
        return position;
    }
    public LocalDate getEmployementStartDate(){
        return startingDate;
    }
    public LocalDate getEmployementEndDate(){
        return endingDate;
    }
    public int getYearsOfService(){
        if (isOnTheJob == true){
            return yearsOfService = Period.between(startingDate, today).getYears();
        }else {
            return yearsOfService = Period.between(startingDate, endingDate).getYears();
        }
    }
    public int getMonthsOfService(){
        if (isOnTheJob == true){
            return monthsOfService = Period.between(startingDate, today).getMonths();
        }else {
            return monthsOfService = Period.between(startingDate, endingDate).getMonths();
        }
    }
    public int getDaysOfService(){
        if (isOnTheJob == true){
            return daysOfService = Period.between(startingDate, today).getDays();
        }else {
            return daysOfService = Period.between(startingDate, endingDate).getDays();
        }
    }
    public double getBaseWage(){
        return baseWage;
    }
    public double getGosiPercentage (){
        return gosiPercentage;
    }
    public double getHousingAllowance(){
        return housingAllowance = (baseWage / 100) * 25;
    }
    public double getTransportationAllowance(){
        return transportationAllowance = (baseWage / 100) * 10;
    }
    public double getNetSalary(){
        return netSalary = netSalary + (baseWage + housingAllowance + transportationAllowance) - gosiPercentage;
    }
    
}
