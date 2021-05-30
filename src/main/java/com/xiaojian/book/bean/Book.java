package com.xiaojian.book.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Book {
    @ApiModelProperty("书名")
    private String bookName;
    @ApiModelProperty("ISBN")
    private String ISBN;
    @ApiModelProperty("作者")
    private String author;
    @ApiModelProperty("出版社")
    private String publisher;

    public Book() {
    }

    public Book(String bookName, String ISBN, String author, String publisher) {
        this.bookName = bookName;
        this.ISBN = ISBN;
        this.author = author;
        this.publisher = publisher;
    }


}
