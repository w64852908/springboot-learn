package com.lanxiang.springboot.zebra.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by lanxiang on 2017/11/9.
 */
public class DateUtils {

    private static final DateTimeFormatter showDateFormatter = DateTimeFormat.forPattern("yyyyMMdd");

    private static final SimpleDateFormat simpleDateFormatter = new SimpleDateFormat("yyyyMMdd");

    public static String date2ShowDate(Date date) {
        return simpleDateFormatter.format(date);
    }

    public static Date showDate2Date(String showDate) {
        return showDateFormatter.parseDateTime(showDate).toDate();
    }
}

