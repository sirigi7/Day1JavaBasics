public class StaticDemo {
    // Static variable
    static int count = 0;

    // Static block
    static {
        System.out.println("Static block called.");
    }

    // Static method
    static void incrementCount() {
        count++;
    }

    public static void main(String[] args) {
        System.out.println("Initial count value: " + count);

        incrementCount();
        System.out.println("Count after increment: " + count);

        incrementCount();
        System.out.println("Count after increment: " + count);
    }
}