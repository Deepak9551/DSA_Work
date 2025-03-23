package com.Spring.took.pattern;

public class Pattern {

    public static void printHollowPatter(int n) {
        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }


        for (int col = 0; col < 2 * row + 1; col++) {
            System.out.print("_");
        }
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            System.out.println();



        }

for (int row = 0 ;row<n;row++){
    for (int col = 0; col < row +1; col++) {
        System.out.print("*");
    }
    for (int col = 0; col < 2 * n - 2 * row - 1; col++) {
        System.out.print("_");
    }
    for (int col = 0; col < row + 1; col++) {
        System.out.print("*");
    }
    System.out.println();
}
    }


    public static void NumberPattern(int n ){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(row + 1 );
                if (col != row) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print(row + 1);
                if (col != n - row -1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void extra(int a){

        for (int row = 0; row < a; row++) {
            for (int col = 0; col < row + 1; col++) {
                int ans = col ;
                char c = (char) (ans + 'A');

                System.out.print(c);
            }

            for (int col = row ; col >= 1 ; col--){
                int ans = col - 1 ;
                char c = (char) (ans + 'A');

                System.out.print(c);
            }
            System.out.println();
        }

    }
public static void Numberic(int n ){
    for (int row = 0; row < n; row++) {
        for (int col = 0; col < row + 1; col++) {
            if(row == 0 || row == n - 1 ||  col == 0 || col == row  ){
                System.out.print(col + 1);
            }
            else {
                System.out.print("*");
            }

        }
        System.out.println();
    }


}
    public static void NumbericInverted(int n){
        int count  ;
        for (int row = 0; row < n; row++) {
            count = row  + 1;
            for (int col = 0; col < n - row; col++) {
                if (row==0 || row == n-1 || col == 0 || col == n-row-1) {
                    System.out.print(count ++);
                }
                else{
                    System.out.print(" ");
                    count++;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern.NumbericInverted(5);
//Pattern.printHollowPatter(5);

// Pattern.NumberPattern(6);
// Pattern.extra(6);
    }
}
