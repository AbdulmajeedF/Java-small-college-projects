public class OuterClass {
    String hello = "Hello, world of outer";
    
    void callInnerClass (){
        InnerClass obj = new InnerClass();
        obj.display();
    }
    
    
    public class InnerClass 
    {
    String hello2 = "Hello world of inner";
        void display (){
            System.out.println(hello2);
        }
    }
}
