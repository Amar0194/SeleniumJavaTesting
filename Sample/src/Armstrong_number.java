import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int copy = num;
        int ans=0;
        while(num!=0){
            int temp = num%10;
            ans = ans+(temp*temp*temp);
            num=num/10;

        }
        System.out.println(ans);
        if(ans==copy){
            System.out.println("Armstrong number");
        }else {
            System.out.println("Not a Armstrong number");
        }
    }
}
