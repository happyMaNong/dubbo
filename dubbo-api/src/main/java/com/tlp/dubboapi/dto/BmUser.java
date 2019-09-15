package com.tlp.dubboapi.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author：tlp
 * @crateDate：2019/9/15 18:56
 */

public class BmUser implements Serializable {
    private String id;
    private String name;
    private String age;

    @Override
    public String toString() {
        return "BmUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
