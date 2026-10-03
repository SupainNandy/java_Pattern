public class Pattern6 {
    static void main(){
        int n=4;

        for(int i=1; i<=n;i++){

            //Print spaces
            for(int s=1; s<=i-1;s++){
                System.out.print(" ");
            }

            //Print star
            for(int j=1; j<=2*n-2*i+1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}