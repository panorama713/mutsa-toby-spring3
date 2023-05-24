package com.example.springbootgradle.domain;

/**
 * packageName : com.example.springbootgradle.domain
 * fileName : User
 * author : gim-yeong-geun
 * date : 2023/05/23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/05/23         gim-yeong-geun          최초 생성
 */
public class User {
    private String id;
    private String name;
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
