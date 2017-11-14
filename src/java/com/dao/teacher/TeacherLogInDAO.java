/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.teacher;

import com.dao.BaseDAO;
import com.entity.Classes;
import com.entity.Teacher;
import com.ulti.Convert;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pet
 */
public class TeacherLogInDAO extends BaseDAO {

    private static TeacherLogInDAO instance;

    public static TeacherLogInDAO getInstance() {
        if (instance == null) {
            return new TeacherLogInDAO();
        }
        return instance;
    }

    public Teacher logIn(String user, String pass) throws IOException, ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM TeacherTBL WHERE LOWER(TeacherID) = ? AND LOWER(PassWord) = ? ";
        Teacher t = new Teacher();
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            pre = conn.prepareStatement(sql);
            pre.setString(1, user.toLowerCase());
            pre.setString(2, Convert.getInstance().convertMD5(pass).toLowerCase());
            rs = pre.executeQuery();
            while (rs.next()) {
                t.setId(rs.getString("TeacherID"));
                t.setName(rs.getString("TeacherName"));
                if (rs.getString("Classes") != null) {
                    List<Classes> lstClass = new ArrayList<>();
                    String[] lstClassStr = rs.getString("Classes").split(",");
                    for (String str : lstClassStr) {
                        Classes c = new Classes();
                        c.setName(str);
                        lstClass.add(c);
                    }
                }
            }
        } finally {
            closeConnection(conn, pre, rs);
        }
        return t;
    }
}
