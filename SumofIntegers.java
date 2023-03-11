public class SumofIntegers {
    public static void main(String[] args) {
        int sum = 0;

        // Loop through each command line argument
        for (int i = 0; i < args.length; i++) {
            // Convert the argument from string to integer
            int num = Integer.parseInt(args[i]);
            // Add the integer value to the sum variable
            sum += num;
        }

        // Output the sum of the integers
        System.out.println("Sum of the integers is " + sum);
    }
}

