package com.xu.web2.util;

import com.xu.web2.annotation.EnumUsername;
import com.xu.web2.annotation.Max;
import com.xu.web2.annotation.Min;
import com.xu.web2.bean.Account;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class TestId extends Throwable {

    public static void testId(Account account) throws Exception {

        if (null!=account){
            Class clz=account.getClass();
            Field[] fields=clz.getDeclaredFields();
            Field field=null;
            for (int i=0,len=fields.length;i<len;i++){
                field=fields[i];
                Annotation[] annotations=field.getAnnotations();
                Min min=null;
                Max max=null;
                EnumUsername username=null;
                for (Annotation annotation:annotations){
                    if (annotation instanceof Min){
                        min= (Min) annotation;
                        //System.out.println("mim:"+min.getClass());

                    }else if (annotation instanceof Max){
                        max= (Max) annotation;
                        //System.out.println("max:"+max.getClass());
                    }else if (annotation instanceof EnumUsername){
                        username= (EnumUsername) annotation;
                    }
                }
                if (null!=min){
                    field.setAccessible(true);
                    String name=field.getName();
                    Object obj=field.get(account);
                    System.out.println("obj:"+obj);
                    int minValue= (int) obj;
                    if (minValue<1){
                        System.out.println("id不能小于1");
                        throw new Exception("id不能小于1");
                    }
                }
                if (null!=max){
                    field.setAccessible(true);
                    String name=field.getName();
                    Object obj=field.get(account);
                    System.out.println("obj:"+obj);
                    int maxValue= (int) obj;
                    int defautltValue=max.max();
                    System.out.println("max:"+defautltValue);
                    if (maxValue>10){
                        throw new Exception("id不能大于默认最大值");
                    }
                }
                if(null!=username){
                    field.setAccessible(true);
                    String name=field.getName();
                    Object obj=field.get(account);
                    String enumName= (String) obj;
                    String[] enumsName=username.enums();
                    Boolean flag=false;
                    for(String str:enumsName){
                        if (str!=null&&str.equals(enumName)){
                            flag=true;
                        }
                    }
                    if (flag==false){
                        throw new Exception("该字段为枚举类型，"+enumName+"不是枚举参数");
                    }
                }
            }
        }
    }
}
