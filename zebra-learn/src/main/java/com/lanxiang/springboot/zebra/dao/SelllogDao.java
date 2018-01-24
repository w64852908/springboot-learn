package com.lanxiang.springboot.zebra.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lanxiang.springboot.zebra.po.Selllog;


@Repository
public interface SelllogDao {

    int insert(@Param("selllog") Selllog selllog);

    Selllog selectByIdAndCreateDate(@Param("id") Long id, @Param("createDate") Date createDate);
}
