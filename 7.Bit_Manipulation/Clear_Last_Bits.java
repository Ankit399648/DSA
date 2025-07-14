public class Clear_Last_Bits {
    public static void main(String[] args) {
        int n=15;
        int mb=(~0)<<2;
        System.out.println(n&mb);
    }
}
