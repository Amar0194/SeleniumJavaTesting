package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<Integer> li = new ArrayList<>();
        li.add(35);
        li.add(45);
        li.add(75);

        for(int i=0;i<li.size();i++){
            System.out.println(li.get(i));
        }

        for(Integer i:li){
            System.out.println(i);
        }

        System.out.println(li.indexOf(5));

        li.add(1,78);
        System.out.println(li);


        ArrayList<Integer> li1 = new ArrayList<>();
        li1.add(1);
        li1.add(24);
        li1.add(89);

        li.addAll(li1);
        System.out.println(li);

        li.remove(2);
        System.out.println(li);

        Collections.sort(li);
        System.out.println(li);

        li.sort(Collections.reverseOrder());
        System.out.println(li);

            }
        };


