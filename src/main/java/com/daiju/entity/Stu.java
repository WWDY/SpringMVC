package com.daiju.entity;

/**
 * @Author WDY
 * @Date 2020-12-09 11:40
 * @Description TODO
 */
public class Stu {
    private String name;
    private Integer age;

    public Stu() {
    }

    public Stu(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
