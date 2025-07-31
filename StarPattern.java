public class StarPattern {
    public static void main(String[] args) {
        int n = 5; // You can change this value to print a different size pattern
        printStarPattern(n);
    }

    public static void printStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}