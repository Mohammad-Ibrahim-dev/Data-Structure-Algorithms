package Patterns;

public class Pattern19 {
    public static void main(String[] Args){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
//Output:-
/*

1 1 1 1 1
2 2 2 2
3 3 3
4 4
5

 */
