package com.lanxiang.springboot.zebra.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lanxiang.springboot.zebra.po.Show;


@Repository
public interface ShowDao {

    int insert(@Param("show") Show show);

    int insertList(@Param("shows") List< Show> show);

    List<Show> select(@Param("show") Show show);

    int update(@Param("show") Show show);

}
