class Power_Of_Two
{
    public static void main(String[] args) {
        int num=16;
        if((num & (num-1))==0){
            System.out.println("power of two");
        }
        else{
            System.out.println("not power of two");
        }
    }
}