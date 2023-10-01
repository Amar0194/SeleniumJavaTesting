package ConditionalStatements;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        String month;
        Scanner in = new Scanner(System.in);
        month=in.next();
        switch (month) {
            case "jan", "mar", "may", "july", "aug", "oct", "dec" -> System.out.println(31);
            case "apr", "june", "sept", "nov" -> System.out.println(30);
            case "feb" -> System.out.println(28);
            default -> System.out.println("wrong value");

        }
    }
}
