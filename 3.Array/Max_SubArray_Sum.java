public class Max_SubArray_Sum {
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,2};

        int sum;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
                sum=0;
                for(int k=i; k<=j; k++)
                {
                    sum+=arr[k];
                    if(maxSum<sum)  maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
