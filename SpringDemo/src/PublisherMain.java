import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PublisherMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext   classPathXmlApplicationContext=
                new ClassPathXmlApplicationContext("spring.xml");

        Publisher publisher_bean= (Publisher) classPathXmlApplicationContext.getBean("publisher_bean");
        System.out.println(publisher_bean);
classPathXmlApplicationContext.close();
     }
}
