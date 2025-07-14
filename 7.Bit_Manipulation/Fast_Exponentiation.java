

public class Fast_Exponentiation {
    public static void main(String[] args) {
        int base=5;
        int power=3;      

        // initializing the ans with 1
        int ans=1;
        // we will continue doing this till power is greater than 1
        while(power>0){
            // if the LSB is 1
            if( (power&1)!=0 )
            {
                // multiply the ans with current base(power of the current place of the bit)
                ans*=base;
            }
            // updating the base so that it is the current power of the bit place
            base=base*base;
            // moving the bit to right by 1 Position
            power=power>>1;
        }
        System.out.print(ans);
    }
}
