class Linear_Search
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,55,77,22,39,44};
        int key=339;
        boolean flag=false;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]==key)
            {
                System.out.println("Element found at index:"+i);
                flag=true;
                break;
            }
        }  
        if(!flag)
        {
            System.out.println("Not found");
        }

    }
}