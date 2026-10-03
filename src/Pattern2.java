public class Pattern2{
    static void main(){
        int n = 5;
        for (int r=1;r<=n;r++){
            for(int c=1;c<=r;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}