import java.io.File;
import java.util.Objects;

public class Application {
    public static void main(String[] args) {
//        String name = null;
//        System.out.println(name.length());
        Object object = new String("123");
        File file = (File) object;
        System.out.println(file);
    }
}
