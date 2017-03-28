package com.tikal.dtos;

import java.io.Serializable;

/**
 * Created by Pniel Abramovich
 */
public class AccountDTO implements Serializable {

    private String name;
    private int age;
    private String description;

    private String serverMessage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServerMessage() {
        return serverMessage;
    }

    public void setServerMessage(String serverMessage) {
        this.serverMessage = serverMessage;
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                ", serverMessage='" + serverMessage + '\'' +
                '}';
    }
}
