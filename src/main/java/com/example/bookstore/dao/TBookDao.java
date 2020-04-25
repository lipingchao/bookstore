package com.example.bookstore.dao;

import com.example.bookstore.pojo.TBook;
import com.example.bookstore.pojo.TBookExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TBookDao {
    long countByExample(TBookExample example);

    int deleteByExample(TBookExample example);

    int deleteByPrimaryKey(String id);

    int insert(TBook record);

    int insertSelective(TBook record);

    List<TBook> selectByExample(TBookExample example);

    TBook selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TBook record, @Param("example") TBookExample example);

    int updateByExample(@Param("record") TBook record, @Param("example") TBookExample example);

    int updateByPrimaryKeySelective(TBook record);

    int updateByPrimaryKey(TBook record);
}