import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Info { String author(); }
class Demo {
    @Info(author = "Student") public void run() {}
}
public class Exp15 {
    public static void main(String[] args) throws Exception {
        Info info = Demo.class.getMethod("run").getAnnotation(Info.class);
        System.out.println("Author=" + info.author());
    }
}
