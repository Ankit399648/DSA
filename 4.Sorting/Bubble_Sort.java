public class Bubble_Sort {

    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return;
    }

    public static void main(String[] args) {
        int arr[]={8,7,6,5,4,3,2,1};
        bubbleSort(arr);
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
}
