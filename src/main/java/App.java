import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 =  (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =  (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("HelloWorld objects comparison: " + (bean1 == bean2));


        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println("Cat objects comparison: " + (catBean1 == catBean2));


        System.out.println(bean1.getMessage());
    }
}