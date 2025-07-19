public class Reverse_Printing {
    public static void printReverse(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printReverse(n - 1);
    }

    public static void main(String[] args) {
        printReverse(10);
    }
}
