package com.sangsang.autoblog.domain.model;

import java.util.Date;

import lombok.Data;

@Data
public class Content {
    private String title;
    private String body;
    private String[] tags;
    private String imageUrl;
    private String summary;
    private Date date;
}
