package com.xu.web2.config;


import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {
    //解析请求
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        //获取语言参数
        String language= httpServletRequest.getParameter("l");
        //默认
        Locale locale=Locale.getDefault();
        //国际化参数
        if (!StringUtils.isEmpty(language)){
            String[] split=language.split("_");
            locale=new Locale(split[0],split[1]);

        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
