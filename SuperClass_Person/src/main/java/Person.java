import java.time.LocalDate;
import java.time.Period;

public class Person {
        
        //Person Name:
        private String fName;
        private String mName;
        private String lName;
        //Person Nationality:
        private String nationality;
        //Person birthDate:
        private int birthYear;
        private int birthMonth;
        private int birthDay;
        private int age;
        //Person Residency:
        private String residenceCountry;
        private String residenceCity;
        private String residenceAddress;
        private String fullAddress;
        
        
        public Person (){
                fName = "NO_NAME";
                mName = "NO_MIDDLE_NAME";
                lName = "NO_LAST_NAME";
                
                nationality = "NO_NATIONALITY";
                
                birthYear = 0;
                birthMonth = 0;
                birthDay = 0;
                age = 0;
                
                residenceCountry = "UNKNOWN";
                residenceCity = "UNKNOWN";
                residenceAddress = "NO_ADDRESS";
                fullAddress = "NO_ADDRESS";
        }
        
        public void setFirstName (String newName){
                fName = newName;
        }
        public void setMiddleName (String newName){
                mName = newName;
        }
        public void setLastName (String newName){
                lName = newName;
        }
        public void setNationality (String newNationality){
                nationality = newNationality;
        }
        public void setBirthYear (int year){
                birthYear = year;
        }
        public void setBirthMonth (int month){
            birthMonth = month;
        }
        public void setBirthDay (int day){
            birthDay = day;
        }
        public void setResidenceCountry (String country){
            residenceCountry = country;
        }
        public void setResidenceCity(String city){
            residenceCity = city;
        }
        public void setResidenceAddress(String address){
            residenceAddress = address;
        }
        public String getFirstName(){
            return fName;
        }
        public String getMiddleName(){
            return mName;
        }
        public String getLastName(){
            return lName;
        }
        public String getFullName(){
            return fName + " " + mName + " " + lName;
        }
        public String getNationality(){
            return nationality;
        }
        public int getBirthYear(){
            return birthYear;
        }
        public int getBirthMonth(){
            return birthMonth;
        }
        public int getBirthDay(){
            return birthDay;
        }
        public int getAge(){
            LocalDate today = LocalDate.now();
            LocalDate birthday = LocalDate.of(this.birthYear, this.birthMonth, this.birthDay);
            return age = Period.between(birthday, today).getYears();
        }
        public String getResidenceCountry(){
            return residenceCountry;
        }
        public String getResidenceCity(){
            return residenceCity;
        }
        public String getResidenceAddress(){
            return residenceAddress;
        }
        public String getFullAddress(){
            return fullAddress = residenceCountry + ", " + residenceCity + ", " + residenceAddress;
        }
        
        
}