package com.heiqi.chat.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Blog {
    private int BlogID;
    private int UserID;
    private String Content;
    private Date PostTime;
}
