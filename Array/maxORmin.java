package Array;

//Find the maximum & minimum number in an array of integers

import java.util.Scanner;
public class maxORmin {
    public static void main(String[] Args){
        Scanner sc= new Scanner(System.in);
        int size=5;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int[] NumArr =new int[size];
        for (int i = 0; i < NumArr.length; i++) {
            NumArr[i]=sc.nextInt();
        }
        for (int i : NumArr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
//            use above or below code
//            max=Math.max(i,max);
//            min=Math.min(i,min);
        }
        System.out.println("maximum: "+max);
        System.out.println("minimum: "+min);
//        System.out.println(Math.max());
    }
}
