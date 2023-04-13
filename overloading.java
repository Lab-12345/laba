public class overloading {
    public static void main(String[] args) {
        overloading example = new overloading();
        System.out.println(example.add(10, 20));
        System.out.println(example.add(10.0, 20L));
        System.out.println(example.add(10.0, 20));

        System.out.println(example.add(10, 20.0));
    }

    public int add(int a, int b) {
        System.out.println("int add(int a,int b)");
        return a + b;
    }

    public long add(int a, long b) {
        System.out.println("long add(int a,long b)");
        return a + b;
    }
    public double add(double a, long b)
    {System.out.println("double add( double a, long b)");
  return a+b;
}
public double add(double a, Double b)
    {System.out.println("double add( double a, float b)");
  return a+b;
}
}