package com.example.bookstore.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * T_BOOK
 * @author 
 */
@Table(name="T_BOOK")
@Data
public class TBook implements Serializable {
    @Id
    @GeneratedValue
    private String id;

    private String bookName;

    private String bookIntroduce;

    private String bookAuthor;

    private String borrowingCount;

    private BigDecimal borrowingFlag;

    private String picUrl;

    private static final long serialVersionUID = 1L;
}