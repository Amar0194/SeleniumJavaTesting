package Looping;

public class Palindrome {
    public static void main(String[] args){
        int num = 678;
        int copy = num;
        int rev = 0;
        while(num!=0){
            int temp = num % 10;
            rev = (rev*10) + temp;
            num = num/10;
        }
        if(rev==copy){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
        }

    }

