package com.xiaoyao.actions;

/**
 * @Program:
 * @ClassName:
 * @Date: 2022/12/5 22:35
 * @Auther: 潇遙
 * @Project_Name: java_web
 * @Description:
 */
public class LoginAction {
    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

public String execute(){
    System.out.println("name: " + username);
    System.out.println("age: " + age);
    return "success";
}
}
