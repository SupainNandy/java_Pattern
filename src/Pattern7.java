public class Pattern7 {

    public static void main(String[] args) {

        int n = 4;

        for (int row = 1; row <= n; row++) {

            // For each row, have 6 columns
            for (int col = 1; col <= 6; col++) {

                if (row == 1 || row == n) {
                    System.out.print("* ");
                }
                else if (col == 1 || col == 6) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            // Move to next row
            System.out.println();
        }
    }
}