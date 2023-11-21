import aop.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;

public class Main {
    public static void main(String[] args) {
        String config="appication.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) ctx.getBean("someService");
        System.out.println(someService.doOther());
    }
}
