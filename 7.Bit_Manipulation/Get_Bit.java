public class Get_Bit {
    public static void main(String[] args) {
        int num=11;
        int pos=1;
        int bitmask=1<<pos;
        System.out.println( (num&bitmask)==0?"notset":"set" );
    }
}
