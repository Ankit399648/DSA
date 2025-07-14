public class Sortest_Path {
    public static void main(String[] args) {
        String path="NWWSSEENNSEN";
        int x=0,y=0;
        for(int i=0;i<path.length();i++)
        {
            char dir=path.charAt(i);
            switch (dir) {
                case 'N' -> y++;
                case 'S' -> y--;
                case 'E' -> x++;
                case 'W' -> x--;
                default -> {
                }
            }
        }
        int x2=x*x;
        int y2=y*y;
        System.out.print(Math.sqrt(x2+y2));
    }
}
