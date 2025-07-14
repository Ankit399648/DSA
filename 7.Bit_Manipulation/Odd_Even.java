public class Odd_Even {
    public static void main(String args[])
    {
        int num=10;
        int bitmask=1;
        if((num & bitmask) == 0)    System.out.print("even");
        else System.out.print("odd");
    }
}
