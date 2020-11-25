package com.xu.web2.bean;


import com.xu.web2.annotation.EnumUsername;
import com.xu.web2.annotation.Max;
import com.xu.web2.annotation.Min;

public class Account {
    //在同一个变量上定义两个注解只生效了一个。why？已解决，条件判断语句写法问题。两个条件语句并列时两个条件都会进行判断，判断二次。
    //而用else连接两个if语句时，判断一次
    @Min
    @Max
    private Integer id;
    @EnumUsername(enums = {"zhang","li"})
    private String username;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
