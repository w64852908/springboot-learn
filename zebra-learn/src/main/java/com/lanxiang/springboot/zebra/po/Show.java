package com.lanxiang.springboot.zebra.po;

import java.util.Date;

import com.lanxiang.springboot.zebra.util.DateUtils;

/**
 * Created by lanxiang on 2017/11/8.
 */
public class Show {

    private Integer id;

    private Long showNum;

    private Integer showDate;

    private Date created;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getShowNum() {
        return showNum;
    }

    public void setShowNum(Long showNum) {
        this.showNum = showNum;
    }

    public Integer getShowDate() {
        return showDate;
    }

    public void setShowDate(Integer showDate) {
        this.showDate = showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = Integer.parseInt(DateUtils.date2ShowDate(showDate));
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
