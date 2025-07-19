public class Tiling_Problem {
    public static int tilingProblem(int n)
    {
        // base case
        if(n==1 || n==0){
            return 1;
        }
        // iterating for all the possibilities
        int horizontal=tilingProblem(n-2);
        int vertical = tilingProblem(n-1);
        // returning the answer
        return horizontal+vertical;
    }
    public static void main(String[] args) {
       System.out.println( tilingProblem(10));
    }
}
