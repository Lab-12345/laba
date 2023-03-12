public class Overloading {
    public static void main(String[] args) {
        Overloading example = new Overloading();
        
        // Call the add method with different argument types
        System.out.println(example.add(10, 20));
        System.out.println(example.add(10, 20L));
        System.out.println(example.add(10L, 20));
        System.out.println(example.add(10.0, 20));
        System.out.println(example.add(10, 20.0));
    }
    
    // Overloaded add methods with different argument types
    public int add(int a, int b) {
        System.out.println("int add(int a, int b)");
        return a + b;
    }
    
    public long add(int a, long b) {
        System.out.println("long add(int a, long b)");
        return a + b;
    }
    
    public long add(long a, int b) {
        System.out.println("long add(long a, int b)");
        return a + b;
    }
    
    public double add(double a, int b) {
        System.out.println("double add(double a, int b)");
        return a + b;
    }
    
    public double add(int a, double b) {
        System.out.println("double add(int a, double b)");
        return a + b;
    }
}

