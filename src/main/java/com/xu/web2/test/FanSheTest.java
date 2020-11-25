package com.xu.web2.test;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.xu.web2.bean.Account;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FanSheTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clz=Class.forName("com.xu.web2.bean.Account");
        Class clz2=Account.class;
        Account account=new Account();
        Class clz3=account.getClass();
        Method method=clz.getMethod("getId");
        Method[] methods=clz.getMethods();
        System.out.println(method);
        for (Method method2:methods
             ) {
            System.out.println(method2);
        }
        System.out.println("------------------");

        //获取私有方法
        Method method1=clz.getDeclaredMethod("getId");
        System.out.println(method1);

        Method[] methods1=clz.getDeclaredMethods();
        for (Method method2:methods1
             ) {
            System.out.println(method2);
        }
        System.out.println("------------------");

        //获取构造函数
        Constructor constructor=clz.getConstructor();
        Constructor[] constructors=clz.getConstructors();
        Constructor constructor1=clz.getDeclaredConstructor();
        Constructor[] constructors1=clz.getDeclaredConstructors();

        //获取修饰符
        int modifierType=clz.getModifiers();
        System.out.println(modifierType);

        System.out.println("------------------");

        //获取文件属性
        String className=clz.getName();
        String classSimpleName=clz.getSimpleName();
        Package packageName=clz.getPackage();
        String methodName=clz.getMethod("getId").getName();
        System.out.println(className);
        System.out.println(classSimpleName);
        System.out.println(packageName);
        System.out.println(methodName);

        System.out.println("------------------");

        //获取字段
        //Field field=clz.getField("id");
        Field[] fields=clz.getFields();
        Field field1=clz.getDeclaredField("id");
        Field[] fields1=clz.getDeclaredFields();
        System.out.println(field1);
        for (Field field2:fields1
             ) {
            System.out.println(field2);
        }

        System.out.println("------------------");

        //设置属性
        field1.setAccessible(true);//设置属性可访问

        //实例化对象
        Account account1= (Account) clz.newInstance();
        Account account2= (Account) constructor1.newInstance();

        //方法调用
        Method method2=clz.getDeclaredMethod("setId", Integer.class);
        method2.setAccessible(true);
        method2.invoke(account2,3);
        System.out.println(account2);


    }

}
