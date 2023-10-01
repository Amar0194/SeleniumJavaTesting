// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    String word = "madam";
    StringBuilder sb1 = new StringBuilder(word);
    sb1.reverse();
    if(word.contentEquals(sb1)){
        System.out.println("Palindrome");
    }else{
        System.out.println("Not a palindrome");
    }
    }
}