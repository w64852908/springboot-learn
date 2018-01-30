package com.lanxiang.springboot.zebra.dao;

import java.util.Date;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import com.lanxiang.springboot.zebra.po.Selllog;
import com.lanxiang.springboot.zebra.provider.SelllogSelectProvider;


@Repository
public interface SelllogDao {

    int insert(@Param("selllog") Selllog selllog);

    Selllog selectByIdAndCreateDate(@Param("id") Long id, @Param("createDate") Date createDate);

    @SelectProvider(type = SelllogSelectProvider.class, method = "queryByIdAndCreateDate")
    Selllog selectByProvider(Map<String, Object> param);

    @Insert("INSERT INTO record_log(type, order_id, cinema_id, source, create_date, create_time)" +
            "values(#{type}, #{orderId}, #{cinemaId}, #{source}, #{createDate}, #{createTime})")
    @Options(useGeneratedKeys = true, keyColumn = "id")
    int insertByAnnotate(Selllog selllog);
}
