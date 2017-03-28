package server.model;

import java.io.Serializable;

/**
 * Created by pniel abramovich
 */
public class Account implements Serializable {


    private static final long serialVersionUID = -4528803460906357876L;

    private String name;
    private int age;
    private String description;

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

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                '}';
    }
}
