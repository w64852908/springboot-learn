package com.lanxiang.springboot.zebra.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lanxiang.springboot.zebra.dao.ShowDao;
import com.lanxiang.springboot.zebra.po.Show;

@Service
public class ShowService {

    @Resource
    private ShowDao showDao;

    public int insert(Show show){
        return showDao.insert(show);
    }

    public int insertList(List< Show> shows){
        return showDao.insertList(shows);
    }

    public List<Show> select(Show show){
        return showDao.select(show);
    }

    public int update(Show show){
        return showDao.update(show);
    }

}
