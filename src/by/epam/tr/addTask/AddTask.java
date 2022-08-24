package by.epam.tr.addTask;

public class AddTask {
    
    public static void main(String[] args) {
        
        Test1 t1 = new Test1();
        
        t1.setFirst(5);
        
        t1.setSecond(6);
        
        Test1.print();
        
        
        Test2 t2 = new Test2();
        
        Test2 t3 = new Test2("Hello", "Java");
        
        System.out.println(t2.getFirst() + " to " + t2.getSecond());
        
        System.out.println(t3.getFirst() + " " + t3.getSecond());

        
    }
    
}