package com.atguigu.service;


import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: _20200814_eewhdmybatis--com.atguigu.service.impl
 * @author: WaHotDog 2020-09-08 17:23
 **/

@Service
public class BookService  {

    @Autowired
    BookDao bookDao;

    public int getPrice(String isbn) {
        return bookDao.getPrice(isbn);
    }
        @Transactional( propagation = Propagation.REQUIRED)
    public void updatePrice(String isbn,int price) {
        bookDao.updatePrice(isbn,price);
            int i =10/0;
    }
}
