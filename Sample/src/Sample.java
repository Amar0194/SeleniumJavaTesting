import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Sample {

    void modifyList(List<String> names){
        names.add("Mai");
        System.out.println(names);

    }
    public static void main(String[] args){
        Sample obj = new Sample();
        List<String> li = new ArrayList<>(Arrays.asList("Mike","Ryan","Jessica"));
        System.out.println(li);
        obj.modifyList(li);
        System.out.println(li);

    }
}
