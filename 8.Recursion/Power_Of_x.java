public class Power_Of_x{

    public static int optPower(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPow=optPower(x, n/2);
        int halfPower=halfPow*halfPow;
        if(n%2!=0){
            halfPower*=x;
        }
        return halfPower;
    }

    public static int pow(int x,int n)
    {
        if(n==1){
            return x;
        }
        return x*pow(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(optPower(5,3));
    }
}