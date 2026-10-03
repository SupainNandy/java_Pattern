public class Pattern3 {
    static void main(){
        int n=5;

        for(int r=1;r<=n;r++){
            //for each row -> spaces,star

            //spaces
            for(int i=0;i<=n-r;i++){
                System.out.print(" ");
            }

            //star
            for(int j=0;j<=n;j++){
                System.out.print("*  ");
            }

            System.out.println();
        }
    }
}