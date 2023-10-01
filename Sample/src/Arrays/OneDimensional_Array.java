package Arrays;

import java.util.Scanner;

public class OneDimensional_Array {
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            System.out.println("Enter the value of Index: "+i);
            arr[i] = in.nextInt();
        }
        for (int k : arr) {
            System.out.println(k);
        }
        int i[] = {10,54,65,76,87};
        //traversing an array through index
        for (int j : i) {
            System.out.println(j);
        }
        //traversing array thru each loop
        for(int item:i){
            System.out.println(item);
        }
    }
}
    