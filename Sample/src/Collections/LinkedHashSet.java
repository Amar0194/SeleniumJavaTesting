package Collections;

public class LinkedHashSet {
    public static void main(String[] args){
        java.util.LinkedHashSet<Integer> s = new java.util.LinkedHashSet<>();
        s.add(56);
        s.add(67);
        s.add(78);
        s.add(56);
        System.out.println(s);

        for(Integer x:s){
            System.out.println(x);
        }
    }
}
