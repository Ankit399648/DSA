public class Binary_Search {

    public static int binarySearch(int arr[],int key)
    {
        int start = 0 , end = arr.length-1 ;
        while(start <= end)
        {
            int mid = (start+end)/2;
            if( arr[mid]==key )
            {
                return mid;
            }
            else if(arr[mid]>key)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,7,8,9,11,14,16,18};
        System.out.print("Index is:"+binarySearch(arr, 19));
    }
}
