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

    public int insert(Show show) {
        return showDao.insert(show);
    }

    public int insertList(List<Show> shows) {
        return showDao.insertList(shows);
    }

    public Show selectById(int id) {
        return showDao.selectById(id);
    }

    public Show selectByIdAndShowDate(int id, int showDate) {
        return showDao.selectByIdAndShowDate(id, showDate);
    }

    public int update(Show show) {
        return showDao.update(show);
    }

}
