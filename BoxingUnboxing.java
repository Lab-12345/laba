public class BoxingUnboxing {
    public static void main(String[] args) {
        // Example of boxing: converting a primitive to an object
        int primitiveInt = 42;
        Integer boxedInt = Integer.valueOf(primitiveInt);
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Boxed int: " + boxedInt);

        // Example of unboxing: converting an object to a primitive
        Double boxedDouble = Double.valueOf(3.14159);
        double primitiveDouble = boxedDouble.doubleValue();
        System.out.println("Boxed double: " + boxedDouble);
        System.out.println("Primitive double: " + primitiveDouble);
    }
}
