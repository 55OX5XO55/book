package com.xiaojian.book.controller;

import com.xiaojian.book.bean.Book;
import com.xiaojian.book.service.IGetBookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "测试", tags = "测试")
@RequestMapping(value = "/api/v1")
@RestController
@Slf4j
public class GetBookController {

    @Autowired
    private IGetBookService iGetBookService;

    @ApiOperation(value = "测试接口")
    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book test(@RequestParam("path") String path) {
        log.info(path);
        try {
            Book book = iGetBookService.getBook(path);
            return book;
        } catch (Exception e) {
            log.error("读书失败！", e);
            return new Book().setBookName("error book");
        }
    }
}
