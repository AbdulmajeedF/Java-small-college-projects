public class Main {
    public static void main(String[] args) {
        
        OuterClass obj1 = new OuterClass();
        System.out.println(obj1.hello);
        
        OuterClass obj2 = new OuterClass ();
        obj2.callInnerClass ();
        
        OuterClass.InnerClass obj3 = obj1.new InnerClass();
        obj3.display();
        System.out.println(obj3.hello2);

    }
    
}
