/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import dal.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DefinitionsDAO extends DBContext{
    
    //Khai báo các thành phần xử lý DB
    Connection cnn; //Kết nối
    PreparedStatement stm;//Thực hiện các câu lệnh SQL
    ResultSet rs; //Lưu trữ và xử lý dữ liệu

    public DefinitionsDAO() {
        connect();
    }

    private void connect() {
        try {
            cnn = super.connection;
            System.out.println("Connect success");
        } catch (Exception e) {
            System.out.println("Connect fail:" + e.getMessage());
        }
    }
    
//    public ArrayList<Definitions> getListDefinitions() {
//        ArrayList<Definitions> list = new ArrayList<Definitions>();
//        try {
//            String strSelect = "select PartOfSpeech, [Definition], Example from Definitions";
//            stm = cnn.prepareStatement(strSelect);
//            rs = stm.executeQuery();
//            while (rs.next()) {
//                User u = new User();
//                u.account = rs.getString(1);
//                u.pass = rs.getString(2);
//                u.name = rs.getString(3);
//                u.gender = (rs.getBoolean(4)) ? "Male" : "Female";
//                u.address = rs.getString(5);
//                SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
//                u.dob = f.format(rs.getDate(6));
//                list.add(u);
//            }
//        } catch (Exception e) {
//            System.out.println("getList fail:" + e.getMessage());
//        }
//        return list;
//    }
    
}
