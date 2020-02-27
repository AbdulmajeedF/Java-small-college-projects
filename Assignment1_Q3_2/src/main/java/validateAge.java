public class validateAge implements Validate {

    public boolean check(Object o) {
        int O = (int)o;
        while (O > 2002){
            return false;
        }
        return true;
    }
}
