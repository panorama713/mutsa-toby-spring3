package com.example.springbootgradle.dao;

import com.example.springbootgradle.domain.User;

import java.sql.SQLException;

/**
 * packageName : com.example.springbootgradle.dao
 * fileName : UserDaoTest
 * author : gim-yeong-geun
 * date : 2023/05/24
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/05/24         gim-yeong-geun          최초 생성
 */
public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao userDao = new UserDao(connectionMaker);
        User user = new User();
        user.setId("16");
        user.setName("kyeongrok");
        user.setPassword("1234");
        userDao.add(user);

        User selectedUser = userDao.get("16");
        System.out.println(selectedUser.getId());
        System.out.println(selectedUser.getName());
        System.out.println(selectedUser.getPassword());
    }
}
