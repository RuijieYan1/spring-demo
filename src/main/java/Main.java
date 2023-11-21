import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;

public class Main {
    public static void main(String[] args) {
        String config="appication.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        Student student = (Student) ctx.getBean("student");
        System.out.println(student);
    }
}
