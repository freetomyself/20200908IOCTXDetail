package com.atguigu;


import com.atguigu.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: _20200814_eewhdmybatis--com.atguigu
 * @author: WaHotDog 2020-09-08 17:19
 **/

@ContextConfiguration(locations ="classpath:application.xml" )
@RunWith(SpringJUnit4ClassRunner.class)
public class TxTestFactory {

    @Autowired
    BookService bookService;

//    @Test
//    public void getBookPrice(){
//        int price = bookServiceimpl.getPrice("ISBN-002");
//        System.out.println(price);
//    }

    @Test
    public void updateBook(){
        /*ApplicationContext ioc = new ClassPathXmlApplicationContext("application.xml");
        BookService bookServer = (BookService) ioc.getBean("bookServiceimpl");*/
        bookService.updatePrice("ISBN-001",998);

    }

}
