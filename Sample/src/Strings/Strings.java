package Strings;

import java.sql.SQLOutput;
import java.util.Locale;

public class Strings {
        public static void main(String[] args){
            String name = "Hello world!";

            System.out.println(name.length());
            System.out.println(name.charAt(2));
            System.out.println(name.indexOf('1'));
            System.out.println(name.substring(6));
            System.out.println(name.startsWith("world"));
            System.out.println(name.endsWith("world!"));
            System.out.println(name.lastIndexOf("d"));
            System.out.println(name.equals("Hello world!"));
            System.out.println(name.equals("Hello world"));
            System.out.println(name.equalsIgnoreCase("hello"));
            System.out.println(name.toLowerCase(Locale.ROOT));
            System.out.println(name.toUpperCase(Locale.ROOT));
        }
}
