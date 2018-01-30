package com.lanxiang.springboot.zebra.provider;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

/**
 * Created by lanxiang on 2018/1/24.
 */
public class SelllogSelectProvider {

    public String queryByIdAndCreateDate(Map<String, Object> param) {
        return new SQL() {
            {
                SELECT("*");
                FROM("record_log");
                WHERE("id=#{id}");
                WHERE("create_date=#{createDate}");
            }
        }.toString();
    }

}
