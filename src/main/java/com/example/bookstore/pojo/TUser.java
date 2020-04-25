package com.example.bookstore.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * T_USER
 * @author 
 */
@Table(name="T_USER")
@Data
public class TUser implements Serializable {
    @Id
    @GeneratedValue
    private String id;

    private String loginName;

    private String password;

    private String sex;

    private Date createTime;

    private String phone;

    private String email;

    private static final long serialVersionUID = 1L;
}