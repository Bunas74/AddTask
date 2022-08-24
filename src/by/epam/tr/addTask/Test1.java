package by.epam.tr.addTask;

public class Test1 {  
        
        /* 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран
              и методы изменения этих переменных. Добавьте метод, который находит сумму
              значений этих переменных, и метод, который находит наибольшее значение из
              этих двух переменных. */
    
    
    private static int first;
    
    private static int second;
    
    
    public static void print() {
        
        System.out.println("first = " + first);
        
        System.out.println("second = " + second);
        
        System.out.println("sum = " + sum(first, second));
        
        System.out.println("max = " + max(first, second));
     
    }
    
    public void setFirst(int f) {
        
        first = f;
        
    }
           
    public int getFirst() {
        
        return first;
        
    }
    
    public void setSecond(int s) {
        
        second = s;
        
    }
           
    public int getSecond() {
        
        return second;
        
    }
    
    public static int sum(int f, int s) {
        
        int sum;
        
        sum = f + s;
        
        return sum;
        
    }
    
    public static int max(int f, int s) {
        
        int max;
        
        if(f > s) {
            
            max = f;
            
        }
        
        else {
            
            max = s;
            
        }
        
        return max;
        
    }   
    
}
