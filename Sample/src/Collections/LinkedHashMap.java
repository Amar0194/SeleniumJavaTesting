package Collections;

public class LinkedHashMap {
    public static void main(String[] args){
        java.util.LinkedHashMap<String, Integer> m = new java.util.LinkedHashMap<>();
        m.put("Chitti", 4);
        m.put("Chotu", 5);
        m.put("Hemant", 6);
        m.put("Hemant", 7);
        System.out.println(m);
    }
}
