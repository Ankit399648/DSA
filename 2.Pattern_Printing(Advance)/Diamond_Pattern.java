public class Diamond_Pattern {
    public static void main(String[] args) {
        int n=6;
        // for the upper portion
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        // for lower portion of the diamond
        for(int i=n ; i>=1 ; i--)
        {
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
