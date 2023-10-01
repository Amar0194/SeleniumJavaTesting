package Operators;

import java.util.Scanner;
//addition using scanner
public class A1 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter the value of x:");
        x=in.nextInt();
        System.out.println("Enter the value of y:");
        y=in.nextInt();
        z=x+y;
        System.out.println("z:"+z);

    }
}
