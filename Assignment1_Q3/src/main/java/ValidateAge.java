public class ValidateAge implements Validate {
    @Override
    public boolean check(Object o) {
        int age = (Integer)o;
        return age <= 2002;
    }    
}
