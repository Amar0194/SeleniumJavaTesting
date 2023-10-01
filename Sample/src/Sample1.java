import java.util.Arrays;

public class Sample1 {
    public static void main(String[] args){
        int a[] = new int[]{3,4,6,7,8,9,8,9};
        int ans = 1;
        for (int j : a) {
            ans *= j;
        }
        System.out.println(ans);
    }
}
