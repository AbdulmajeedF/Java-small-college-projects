public class validateAge implements Validate {

    public boolean check(Object o) {
        int object = (Integer)o;
        if (object <= 2002){
            return true;
        }else{
            return false;
        }
    }
    
}
