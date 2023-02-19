public class CommandLineArgs {
    public static void main(String[] args) {
        int sum = 0;
        int invalidCount = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                sum += Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        System.out.println("Sum of valid integers: " + sum);
        System.out.println("Number of invalid integers: " + invalidCount);
    }
}
