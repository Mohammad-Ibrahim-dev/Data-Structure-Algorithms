package Array;

import java.util.Scanner;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m=5,n=6;
        int[][] spiral=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                spiral[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiral[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
