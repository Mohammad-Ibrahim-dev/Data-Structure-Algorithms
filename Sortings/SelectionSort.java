package Sortings;

import java.util.Scanner;

public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        int smallest,temp;
        for (int i = 0; i < arr.length-1 ; i++) {
            smallest=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest]>arr[j]) {
                    smallest=j;
                }
            }
            temp = arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.print("enter the size: ");
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("entre the your data: ");
        int[] data= new int[size];
        for (int i = 0; i < size; i++) {
            data[i]= sc.nextInt();
        }
        int[] sortedData=selectionSort(data);
        System.out.println("your sorted data: ");
        for (int s : sortedData){
            System.out.print(s+" ");
        }
    }
}