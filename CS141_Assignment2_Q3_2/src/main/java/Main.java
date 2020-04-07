public class Main 
{
    public static void main(String[] args) 
    {
        
        int num = 45;
        System.out.println(LinearSearch(num));
        
    }  
    public static int LinearSearch(int x)
    {
        int[] list = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        
        for (int i = 0; i < list.length; i++)
        {
            if (x == list[i])
            {
                return i;
            }
        }        
        return -1;
    }   
}
