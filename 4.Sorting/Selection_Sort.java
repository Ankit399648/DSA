public class Selection_Sort
{
    public static void selectionSort(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            int minpos=i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[minpos]>arr[j])
                {
                    minpos = j;
                } 
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={8,7,6,9,4,5,7,2};
        selectionSort(arr);
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
}