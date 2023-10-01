package Operators;

import java.util.Scanner;

public class Greatestof3Integers {
    public static void main(String[] args){
        int x,y,z;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of x,y,z:");
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        if(x>y&&x>z){
            System.out.println("x is Bigger");
        } else if (y>z) {
            System.out.println("y is Bigger");
        }else {
            System.out.println("z is Bigger");
        }
    }
}
