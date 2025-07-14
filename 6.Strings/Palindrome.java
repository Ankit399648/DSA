public class Palindrome {
    public static void main(String[] args) 
    {
        String str="aabbaa";
        int flag=0;
        for(int i=0; i<(str.length()-1)/2; i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                flag=1;
                System.out.println("not palindrome");
                break;
            }
        }  
        if(flag==0)  
            System.out.println("palindrome");
    }
}
