package com.atguigu.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @program: _20200814_eewhdmybatis--com.atguigu.dao
 * @author: WaHotDog 2020-09-08 17:22
 **/


@Repository
public class BookDao {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public Integer getPrice(String isbn){
        String sql = "Select price from book where isbn=?";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class, isbn);
        return integer;
    }

    public void updatePrice(String isbn,int price){
        String sql ="update book set price =? where  isbn=? ";
        jdbcTemplate.update(sql,price,isbn);
    }
}
