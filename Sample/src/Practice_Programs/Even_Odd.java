package Practice_Programs;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args){
        int c;
        System.out.println("Enter the Integer");
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
        if((c/2*2)==c){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }

}
