package Collections;

public class PriorityQueue {
    public static void main(String[] args){
        java.util.PriorityQueue<String> q = new java.util.PriorityQueue<>();
        q.add("Banana");
        q.add("Apple");
        q.add("Orange");
        q.add("Grapes");
        System.out.println(q);
       // q.remove("Apple");
        //System.out.println(q);

        while (!q.isEmpty()){
            String element = q.poll();
            System.out.println("Dequeued:" +element);
        }
    }
}
