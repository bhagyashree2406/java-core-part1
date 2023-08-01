import java.util.ArrayList;
import java.util.List;

public class ListExampleBeforeJava5 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Asmita");
        list.add(100);
        list.add(10.5);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        String secondItem = (String) list.get(1);//we avoid compile time type checking using explicit casting
        //But at run time this will fail
        //bz right side value is Integer and left side is String
        //hence Integer cannot be converted to String
        //Hence exception ClassCastException
    }
}