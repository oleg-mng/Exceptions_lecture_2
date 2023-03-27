import java.io.File;
import java.util.*;

public class Application {
    public static void main(String[] args) {
//        String name = null;
//        System.out.println(name.length());

//        Object object = new String("123");
//        File file = (File) object;
//        System.out.println(file);

//        String number = "123fq";
//        int result =Integer.parseInt(number);
//        System.out.println(result);

//        List<Object> emptylist = Collections.emptyList();
//        emptylist.add(new Object());

        int number = 1;
        try {
            number = 10/1;
            String test = null;
            System.out.println(test.length());
        } catch (ArithmeticException e) {
            System.out.println("operation divide by zero not supported");
        } catch (NullPointerException e){
            System.out.println("nullpointer exception");
        }
        System.out.println(number);
    }
}
