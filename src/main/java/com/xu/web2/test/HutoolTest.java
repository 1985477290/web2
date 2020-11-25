package com.xu.web2.test;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.captcha.ShearCaptcha;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @Author Administrator
 * @Date 2020/11/23 12:13
 * @Version 1.0
 */
public class HutoolTest {
    public static void main(String[] args) {
        Date date= Convert.toDate("2020-11-23");
        String numberToChinese=Convert.numberToChinese(22,true);
        System.out.println(date);
        System.out.println(numberToChinese);

        String now=DateUtil.now();
        DateTime dateTime=DateUtil.date();
        long day =DateUtil.between(date,dateTime, DateUnit.DAY);
        long day2=DateUtil.betweenDay(date,dateTime,true);
        long week=DateUtil.betweenWeek(date,dateTime,true);
        System.out.println(now);
        System.out.println(dateTime);
        System.out.println(day);
        System.out.println(day2);
        System.out.println(week);


        CircleCaptcha circleCaptcha= CaptchaUtil.createCircleCaptcha(80,40);
        LineCaptcha lineCaptcha=CaptchaUtil.createLineCaptcha(100,50);
        ShearCaptcha shearCaptcha=CaptchaUtil.createShearCaptcha(60,60);
        System.out.println(shearCaptcha.getCode());
        System.out.println(lineCaptcha.getImage());
        System.out.println(circleCaptcha.getCode());
        double d=100/(Math.pow(2,1));
        System.out.println(d);
        System.out.println(100.0/(2^3));

        double sum=0;
        for(int i=1;i<10;i++){
            sum=sum+(100/Math.pow(2,i))*2;
        }
        sum=sum+100;
        System.out.println(sum);
    }
}
