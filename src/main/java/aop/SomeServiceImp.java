package aop;
import org.springframework.stereotype.Component;

@Component("someService")
public class SomeServiceImp implements SomeService{

    //目标方法
    public void doSome(String name,Integer age) {
        System.out.println("name:"+name+"年龄"+age);
    }

    @Override
    public String doOther() {
        return "hello";
    }
}
