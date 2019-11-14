package com.aaa.jie.springcloud.Model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Author 李永杰
 * @Date 2019/11/9 19:17
 **/
public class User implements Serializable {
    private Integer id;
    private String  username;
    private String password;
    private String Salt;

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

    public String getSalt() {
        return Salt;
    }

    public void setSalt(String salt) {
        Salt = salt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(Salt, user.Salt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, Salt);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", Salt='" + Salt + '\'' +
                '}';
    }
}
