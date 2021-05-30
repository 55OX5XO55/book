package com.xiaojian.book.service;

import com.xiaojian.book.bean.Book;
import org.springframework.stereotype.Service;

@Service
public class IGetBookImpl implements IGetBookService {
    @Override
    public Book getBook(String path) {
        return new Book("java笔记","1234","肖建","清华大学出版社");
    }
}
