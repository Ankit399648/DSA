public class Insertion_Sort 
{
    static void insertionSort(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) 
    {
        int arr[]={8,7,6,9,4,5,7,2};
        insertionSort(arr);
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
}
