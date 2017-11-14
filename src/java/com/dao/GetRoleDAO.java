/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.util.List;
import com.entity.Role;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Pet
 */
public class GetRoleDAO extends BaseDAO {

    private static GetRoleDAO instance;

    public static GetRoleDAO getInstance() {
        if (instance == null) {
            return new GetRoleDAO();
        }
        return instance;
    }

    public List<Role> getAllRole() throws IOException, ClassNotFoundException, SQLException {
        List<Role> list = new ArrayList<>();
        String sql = "SELECT * FROM ROLETBL";
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();
            while (rs.next()) {
                Role r = new Role();
                r.setName(rs.getString("RoleName"));
                r.setCode(rs.getString("RoleCode"));
                list.add(r);
            }
        } finally {
            closeConnection(conn, pre, rs);
        }
        return list;
    }
}
