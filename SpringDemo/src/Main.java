import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
            ClassPathXmlApplicationContext classPathXmlApplicationContext =
                    new ClassPathXmlApplicationContext("spring.xml");
            Book book_bean = (Book) classPathXmlApplicationContext.getBean("book_bean");
        Book book_bean1 = (Book) classPathXmlApplicationContext.getBean("book_bean constructs");
        Book book_bean2 = (Book) classPathXmlApplicationContext.getBean("book_bean_mixed");
Author author_bean= (Author) classPathXmlApplicationContext.getBean("author_bean");

        //      System.out.println(book_bean.getIsbn()+" "+ book_bean.getPrice()+" "+book_bean.getTitle() );

        System.out.println(book_bean);
        System.out.println(book_bean1);
        System.out.println(book_bean2);

        System.out.println(author_bean);
    }
    }


