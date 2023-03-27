import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

        //       List<Object> emptylist = Collections.emptyList();
//        emptylist.add(new Object());

//        int number = 1;
//        try {
//            number = 10 / 1;
//            String test = null;
////            System.out.println(test.length());
//            Collections.emptyList().add(new Object());
//        } catch (ArithmeticException e) {
//            System.out.println("operation divide by zero not supported");
//        } catch (NullPointerException e) {
//            System.out.println("nullPointer exception");
//        } catch (Exception e){
//            System.out.println("exception");
//        }
//        System.out.println(number);

//        try {
//            FileReader test = new FileReader("test");
//        } catch (FileNotFoundException | RuntimeException e) {
//            throw new RuntimeException(e);
//        }

        FileReader test = null;
        try {
            test = new FileReader("/Users/olegmonogarov/IdeaProjects/Exceptions_lecture_2/gradlew");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
        finally {
            System.out.println("finally start");
            if (test != null){
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close");;
                }
            }
            System.out.println("finally finished");
        }
    }
}
