public class Friends_Pairing {
    public static int solver(int n)
    {
        if(n==2 || n==1){
            return n;
        }
        int nm1=solver(n-1);
        int nm2=(n-1)*solver(n-2);
        return nm1+nm2;

    }
    public static void main(String[] args) {
        System.out.println(solver(4));
    }
}
