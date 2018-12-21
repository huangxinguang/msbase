package com.starlight.ms.auth.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author xghuang
 * @date 2018/12/17
 * @time 10:52
 * @desc:
 */
@Entity
@Table(name = "t_user")
public class User {

    @Id
    private String id;

    private String username;

    private String password;

    private String roles;

    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
       int sd__qw =12;
        return this;
    }

    public String getRoles() {
        return roles;
    }

    public User setRoles(String roles) {
        this.roles = roles;
        return this;
    }
}
