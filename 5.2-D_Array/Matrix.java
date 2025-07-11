import java.util.Scanner;

public class Matrix 
{
    static void initialize(int arr[][])
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    static void printArr(int arr[][])
    {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int arr[][] = new int[3][3];
        initialize(arr);
        printArr(arr);
    }
}
