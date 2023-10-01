package ConditionalStatements;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args){
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a=in.nextInt();
        System.out.println("Enter the value of b:");
        b=in.nextInt();
        System.out.println("Enter the value of c:");
        c=in.nextInt();
        if(a>b && a>c){
            System.out.println("A is bigger");
        }else if(b>a && b>c){
            System.out.println("b is bigger");
        }else{
            System.out.println("C is bigger");
        }
    }
}
