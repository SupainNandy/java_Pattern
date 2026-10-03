public class Pattern5 {
    static void main(){
        int n =5;

        //outerloop for row
        for(int i=1; i<=n;i++){
            //inner loop for space
            for(int s=1; s<=n-i;s++){
                System.out.print(" ");
            }

            //print star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}