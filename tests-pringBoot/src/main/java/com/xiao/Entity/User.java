package com.xiao.Entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;


@Data
@Entity
@javax.persistence.Table
public class User {

    private String name;

    private int id;

    private int age;
}
