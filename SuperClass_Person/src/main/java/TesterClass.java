import java.util.Scanner;
public class TesterClass {
    public static void main(String[] args) {

        Person me = new Person();
        Scanner sc = new Scanner(System.in);
        
        
        
        //Inserting first Name  
        System.out.print("Enter First Name: ");
        String answerFirstName = sc.nextLine();
        me.setFirstName(answerFirstName);
        //Inserting middle name 
        System.out.print("Enter Middle Name: ");
        String answerMiddleName = sc.nextLine();
        me.setMiddleName(answerMiddleName);
        //Inserting last name 
        System.out.print("Enter Last Name: ");
        String answerLastName = sc.nextLine();
        me.setLastName(answerLastName);
        //Inserting Nationality 
        System.out.print("Enter Nationality: ");
        String answerNationality = sc.nextLine();
        me.setNationality(answerNationality);
        //Inserting birth year 
        System.out.print("Enter Birthdate Year: ");
        int answerBirthYear = sc.nextInt();
        me.setBirthYear(answerBirthYear);
        //Inserting birth month 
        System.out.print("Enter Birthdat Month: ");
        int answerBirthMonth = sc.nextInt();
        me.setBirthMonth(answerBirthMonth);
        //Inserting birth year
        System.out.print("Enter Birthdate Day: ");
        int answerBirthDay = sc.nextInt();
        me.setBirthDay(answerBirthDay);
        //Inserting residence country
        System.out.print("Enter Residence Country: ");
        Scanner sc1 = new Scanner (System.in);
        String answerResidenceCountry = sc1.nextLine();
        me.setResidenceCountry(answerResidenceCountry);
        //Inserting residence city
        System.out.print("Enter Residence City: ");
        Scanner sc2 = new Scanner (System.in);
        String answerResidenceCity = sc2.nextLine();
        me.setResidenceCity(answerResidenceCity);
        //Inserting residence address
        System.out.print("Enter Residence address: ");
        Scanner sc3 = new Scanner (System.in);
        String answerResidenceAddress = sc3.nextLine();
        me.setResidenceAddress(answerResidenceAddress);
       
        //----------------------------------------------------------//
        System.out.println("");
        System.out.println("Summary of your profile: ");
        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("");
        System.out.println(me.getFullName() + ".");
        System.out.println(me.getNationality() + ".");
        System.out.println(me.getAge() + " years old.");
        System.out.println(me.getFullAddress() + ".w");
        
        
    }
}
