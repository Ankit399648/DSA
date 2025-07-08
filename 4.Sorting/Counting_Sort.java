public class Counting_Sort 
{
    static void countingSort(int arr[])
    {
        // finiding the largest element in the array
        int largest=arr[0];
        for(int i=1; i<arr.length; i++)
        {
            largest=Math.max(largest,arr[i]);
        }

        // creating the frequency array
        int frequency[]=new int[largest+1];
        // finding out the frequency of each element in the array
        for(int i=0; i<arr.length; i++)
        {
            frequency[arr[i]]++;
        }

        // inserting the element in the array
        int j=0;
        for(int i=0; i<frequency.length; i++)
        {
            while(frequency[i]>0)
            {
                arr[j]=i;
                j++;
                frequency[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,7,6,3,4,3,2,1};
        countingSort(arr);
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
}
