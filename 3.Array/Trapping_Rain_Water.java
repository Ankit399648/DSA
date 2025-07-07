public class Trapping_Rain_Water {
    public static void main(String[] args) 
    {
        int height[]={4,2,0,6,3,5};

        int leftAux[]=new int[height.length];
        leftAux[0]=height[0];
        for(int i=1; i<leftAux.length; i++)
        {
            leftAux[i]=Math.max(height[i], leftAux[i-1]);
        }

        int rightAux[]=new int[height.length];
        rightAux[rightAux.length-1]=height[height.length-1];
        for(int i=height.length-2; i>=0; i--)
        {
            rightAux[i]=Math.max(rightAux[i+1], height[i]);
        }

        int trappedWater=0;

        for(int i=0; i<height.length; i++)
        {
            int trappedCurr = Math.min(leftAux[i],rightAux[i]) - height[i];
            if(trappedCurr > 0)     trappedWater += trappedCurr;
            
        }

        System.out.println(trappedWater);
    }
}
