package Patterns;

public class Pattern8 {
    public static void main(String[] Args){
        int n=5;
        int counts=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counts+" ");
                counts++;
            }
            System.out.println();
        }
    }
}
//Output:-
/*

1
2  3
4  5  6
7  8  9  10
11 12 13 14 15

 */
