public class Pattern4 {
    static void main(){
        int n = 5;

//        outerloop
        for(int i=1; i<=n;i++){
            //Inner loop for print start
            for(int c=1;c<=n-i+1;c++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}