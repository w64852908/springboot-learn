package com.lanxiang.springboot.zebra.service;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lanxiang.springboot.zebra.dao.SelllogDao;
import com.lanxiang.springboot.zebra.po.Selllog;

@Service
public class SelllogService {

    @Resource
    private SelllogDao selllogDao;

    public int insert(Selllog selllog) {
        return selllogDao.insert(selllog);
    }

    public Selllog queryByIdAndCreateDate(Long id, Date createDate) {
        return selllogDao.selectByIdAndCreateDate(id, createDate);
    }
}
