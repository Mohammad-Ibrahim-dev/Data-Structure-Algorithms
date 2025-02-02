package Patterns;

public class Pattern17 {
    public static void main(String[] Args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int cos;
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //numbers
            for (int j = 1; j <= i; j++) {
                if(j==1||j==i){
                    System.out.print("1 ");
                }
                else {
                    cos =(i-j+1)/j;
                    System.out.print(cos + " ");
                }
            }
            System.out.println();
        }
    }
}
//Output:-
/*

    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

 */
