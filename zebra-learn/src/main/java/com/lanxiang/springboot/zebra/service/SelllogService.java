package com.lanxiang.springboot.zebra.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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

    public Selllog queryByIdAndCreateDateFromProvider(Long id, Date createDate) {
        Map<String, Object> param = new HashMap<>();
        param.put("id", id);
        param.put("createDate", createDate);
        return selllogDao.selectByProvider(param);
    }

    public Long insertByAnnotation(Selllog selllog) {
        selllogDao.insertByAnnotate(selllog);
        return selllog.getId();
    }
}
