package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Student实体类
@Component
public class Student {

    @Value("1")
    private Integer id;

    @Value("白敬亭")
    private String name;

    @Value("163.com")
    private String email;

    @Value("23")
    private Integer age;

    @Value("南京大学")
    private String school;

    @Value("133838")
    private String phone;


    public Student(){}

    public Student(Integer id,String name,String email,Integer age,String phone,String school){
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
        this.school = school;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "pojo.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
