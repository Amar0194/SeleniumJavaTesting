package Looping;

import java.util.Scanner;

public class Armstrong_eg {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int copy = num;
        int ans = 0;
        int noOfDigit = 0;
        while(num!=0){
            noOfDigit++;
            num = num/10;
        }
        num = copy;
        while(num !=0){
            int temp = num%10;
            ans = ans + (int) Math.pow(temp, noOfDigit);
            num = num / 10;
        }
        if(ans==copy){
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not an Armstrong number");
        }
    }
}
