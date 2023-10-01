package Collections;


public class HashSet {
    public static void main(String[] args){
        java.util.HashSet<Integer> s = new java.util.HashSet<>();
        s.add(45);
        s.add(34);
        s.add(56);
        s.add(67);
        System.out.println(s);

        for(Integer x:s){
            System.out.println(x);
        }
    }
}
