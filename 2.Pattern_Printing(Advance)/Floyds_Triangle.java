public class Floyds_Triangle {
    public static void main(String[] args) {   
        int n=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++,n++){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
