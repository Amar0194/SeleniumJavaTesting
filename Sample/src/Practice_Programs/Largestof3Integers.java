package Practice_Programs;

import java.util.Scanner;

public class Largestof3Integers {
    public static void main(String[] args){
        int x, y,z;
        System.out.println("Enter the 3 integers");
        Scanner in = new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();

        if(x>y && x>z){
            System.out.println("X is Bigger");
        } else if (y>x && y>z)
           {
               System.out.println("Y is Bigger");
        }else {
            System.out.println("Z is Bigger");
        }

    }
}
