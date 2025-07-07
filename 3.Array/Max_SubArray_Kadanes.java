public class Max_SubArray_Kadanes {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int cs=0;
        int me=nums[0];
        for(int i=0; i<nums.length; i++)
        {
            cs+=nums[i];
            if(cs<0) cs=0;
            maxSum=Math.max(maxSum,cs);
            me=Math.max(nums[i],me);
        }
        if(me<0) maxSum=me;
        return maxSum;
    }
}
