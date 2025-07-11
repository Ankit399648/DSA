
public class Search_SortedArray {

    public static void search(int arr[][], int key) {
        int row = 0, col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.print("found");
                return;
            } else if (arr[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }
        System.err.print("not found");
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int key = 99;
        search(arr, key);

    }
}
