package com.example.bookstore.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * T_TOOK_BORROW
 * @author 
 */
@Table(name="T_TOOK_BORROW")
@Data
public class TTookBorrow implements Serializable {
    @Id
    @GeneratedValue
    private String id;

    private String bookId;

    private Date borrowingTime;

    private String userId;

    private static final long serialVersionUID = 1L;
}