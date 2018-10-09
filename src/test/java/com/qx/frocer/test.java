package com.qx.frocer;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FrocerApplication.class)
@Slf4j
public class test {

    @Test
    public void  test(){
//        String str="2018-09-26 12:50:09";
//        String str1="2018-09-26 11:50:09";
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        ParsePosition pos = new ParsePosition(0);
//        Date strtodate = formatter.parse(str, pos);
//        System.out.println(strtodate.getTime());
//        ParsePosition pos2 = new ParsePosition(0);
//        Date strtodate2 = formatter.parse(str1, pos2);
//        System.out.println(strtodate2.getTime());
        DecimalFormat df1 = new DecimalFormat("0.00");
        System.out.println(df1.format(0.20222));
    }
}
