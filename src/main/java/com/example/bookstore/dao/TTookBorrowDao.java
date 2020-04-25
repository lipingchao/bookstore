package com.example.bookstore.dao;

import com.example.bookstore.pojo.TTookBorrow;
import com.example.bookstore.pojo.TTookBorrowExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TTookBorrowDao {
    long countByExample(TTookBorrowExample example);

    int deleteByExample(TTookBorrowExample example);

    int deleteByPrimaryKey(String id);

    int insert(TTookBorrow record);

    int insertSelective(TTookBorrow record);

    List<TTookBorrow> selectByExample(TTookBorrowExample example);

    TTookBorrow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TTookBorrow record, @Param("example") TTookBorrowExample example);

    int updateByExample(@Param("record") TTookBorrow record, @Param("example") TTookBorrowExample example);

    int updateByPrimaryKeySelective(TTookBorrow record);

    int updateByPrimaryKey(TTookBorrow record);
}