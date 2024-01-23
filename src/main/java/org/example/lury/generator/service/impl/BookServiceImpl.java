package org.example.lury.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.lury.generator.domain.Book;
import org.example.lury.generator.service.BookService;
import org.example.lury.generator.mapper.BookMapper;
import org.springframework.stereotype.Service;

/**
* @author 星星
* @description 针对表【book】的数据库操作Service实现
* @createDate 2024-01-22 15:09:00
*/
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book>
    implements BookService{

}




