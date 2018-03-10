package com.clawhub.houserenting.main.entity;

import javax.persistence.*;

@Table(name = "t_people")
public class People {
    @Id
    private String id;

    private String name;

    /**
     * 0-男 1-女
     */
    private String sex;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取0-男 1-女
     *
     * @return sex - 0-男 1-女
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置0-男 1-女
     *
     * @param sex 0-男 1-女
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
}