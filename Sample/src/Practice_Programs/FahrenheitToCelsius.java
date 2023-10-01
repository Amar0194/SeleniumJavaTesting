package Practice_Programs;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args){
       float temperature;
        System.out.println("Enter temperature in Fahrenheit");
        Scanner in = new Scanner(System.in);
        temperature = in.nextInt();
        temperature = ((temperature-32)*5/9);
        System.out.println("Temperature in Celsius" +temperature);
    }
}
