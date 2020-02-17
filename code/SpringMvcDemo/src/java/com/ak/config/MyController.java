package com.ak.config;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 这个类是实现 转换器
 * 两个泛型：
 * 第一个:Source 表示想要对什么类型做处理
 * 第二个：Target 表示想要转换成什么类型
 *
 */
public class MyController implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        if (null == s) throw new RuntimeException("source is null!");
        try
        {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            return df.parse(s);
        } catch (ParseException e)
        {
            try {
                DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                return df.parse(s);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            return new Date();
//            throw new RuntimeException("Converter String to Date failed!");
        }
    }
}
