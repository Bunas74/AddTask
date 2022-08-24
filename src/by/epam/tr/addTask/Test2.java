package by.epam.tr.addTask;

public class Test2 {
    
    /* 2. Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
          Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get-
          методы для полей экземпляра класса. */
    
    
    private String first;
    
    private String second;
    
    
    public Test2() {
        
        first = "Welcome";
        
        second = "Java";
        
    }
    
    public Test2(String f, String s) {
        
        first = f;
        
        second = s;
        
    }
    
    public void setFirst(String f) {
        
        first = f;
        
    }
    
    public String getFirst() {
        
        return first;
        
    }
    
    public void setSecond(String s) {
        
        second = s;
        
    }
    
    public String getSecond() {
        
        return second;
        
    }

    
}