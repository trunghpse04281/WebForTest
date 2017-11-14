/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulti;

import com.dao.teacher.TeacherLogInDAO;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pet
 */
public class Convert {

    private static Convert instance;

    public static Convert getInstance() {
        if (instance == null) {
            return new Convert();
        }
        return instance;
    }

    public String convertMD5(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());

            byte byteData[] = md.digest();

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TeacherLogInDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
