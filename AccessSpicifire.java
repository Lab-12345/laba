public class AccessSpicifire {
    public static void main(String args[]) {
        person p = new person("john", 30);
        System.out.println("initial values: ");
        p.sayHello();
        
        p.name = "john";
        System.out.println("after changing public variable: ");
        p.sayHello();

        int x = 5;
        x = increment(x);
        System.out.println("after incrementing x: " + x);

        incrementAge(p);
        System.out.println("after incrementing age: ");
        p.sayHello();

        final int y = 10;
        final person q = new person("bob", 25);
        q.name = "charlie";
        System.out.println("After changing name: " + q);
    }

    public static int increment(int a) {
        return ++a;
    }

    public static void incrementAge(person p) {
        p.age++;
    }

    static class person {
        public String name;
        private int age;

        public person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void sayHello() {
            System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
        }

        public String toString() {
            return "person[name=" + name + ",age=" + age + "]";
        }
    }
}
