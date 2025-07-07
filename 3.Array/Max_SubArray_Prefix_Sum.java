public class Max_SubArray_Prefix_Sum {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }

        for(int i=0; i<prefix.length; i++)
        {
            for(int j=i; j<prefix.length; j++)
            {
                int sum = i==0 ? prefix[i] : prefix[j]-prefix[i-1];
                if(maxSum < sum)    maxSum=sum;
            }
        }
        return maxSum;
    }
}