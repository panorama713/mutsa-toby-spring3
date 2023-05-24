package com.example.springbootgradle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * packageName : com.example.springbootgradle.dao
 * fileName : DUserDao
 * author : gim-yeong-geun
 * date : 2023/05/24
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/05/24         gim-yeong-geun          최초 생성
 */
public class DUserDao extends UserDao{
    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "", "", ""
        );
        return conn;
    }
}
