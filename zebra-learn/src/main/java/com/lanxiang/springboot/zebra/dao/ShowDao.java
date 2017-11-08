package com.lanxiang.springboot.zebra.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.lanxiang.springboot.zebra.po.Show;


@Component
@Mapper
public interface ShowDao {

    int insert(@Param("show") Show show);

    int insertList(@Param("shows") List< Show> show);

    List<Show> select(@Param("show") Show show);

    int update(@Param("show") Show show);

}
