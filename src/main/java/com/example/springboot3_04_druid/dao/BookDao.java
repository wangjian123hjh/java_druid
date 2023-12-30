package com.example.springboot3_04_druid.dao;
import com.example.springboot3_04_druid.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {
    @Select("select * from t_book where id = #{id}")
    public Book getBookById(Integer id);
}
